package com.hr.neo4j.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hr.neo4j.entity.EntityType;
import com.hr.neo4j.entity.EntityTypeTree;
import com.hr.neo4j.mapper.EntityTypeMapper;
import com.hr.neo4j.service.IEntityTypeService;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @since 2022-07-03
 */
@Service
public class EntityTypeServiceImpl implements IEntityTypeService {

    @Resource
    private EntityTypeMapper entityTypeMapper;


    @Override
    public List<EntityType> getEntityTypeTree() {
        return getCombiningData();
    }

    // 组合数据
    private List<EntityType> getCombiningData() {
        List<EntityType> entityTypeList = entityTypeMapper.selectList(null);
        // key parentId  value 集合
        Map<String, List<EntityType>> map = entityTypeList.stream().collect(Collectors.groupingBy(EntityType::getParentId));
        // 获取所有的根节点
        List<EntityType> rootEntityTypeList = map.get("0");
        // 循环根节点
        if (!CollectionUtils.isEmpty(rootEntityTypeList)) {
            for (EntityType rootEntityType : rootEntityTypeList) {
                //递归
                recursiveAddData(rootEntityType, map);
            }
        }
        return rootEntityTypeList;
    }

    /**
     * 递归添加数据
     */
    private EntityType recursiveAddData(EntityType entityType, Map<String, List<EntityType>> map) {
        // 拿到id
        String typeId = entityType.getId();
        // 获取父id为当前id的下层数据
        List<EntityType> entityTypeList = map.get(typeId);

        // 为空 则不存在数据 返回
        if (CollectionUtils.isEmpty(entityTypeList)) {
            return entityType;
        } else { // 存在数据
            // 添加数据
            entityType.setChildren(entityTypeList);
            for (EntityType type : entityTypeList) {
                recursiveAddData(type, map);
            }
        }
        return null;
    }

    @Override
    public Boolean addEntityType(EntityType entityType) {
        return entityTypeMapper.insert(entityType) > 0;
    }

    @Override
    public Boolean delEntityType(String entityTypeId) {
        return entityTypeMapper.deleteById(entityTypeId) > 0;
    }

    @Override
    public Boolean updateEntityType(EntityType entityType) {
        return entityTypeMapper.updateById(entityType) > 0;
    }

    @Override
    public EntityType getEntityType(String entityTypeId) {
        return entityTypeMapper.selectById(entityTypeId);
    }
}
