package com.hr.neo4j.service.impl;

import com.hr.neo4j.entity.EntityInfo;
import com.hr.neo4j.mapper.EntityInfoMapper;
import com.hr.neo4j.service.IEntityInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @since 2022-07-03
 */
@Service
public class EntityInfoServiceImpl implements IEntityInfoService {

    @Resource
    private EntityInfoMapper entityInfoMapper;


    @Override
    public Boolean addEntityInfo(EntityInfo entityInfo) {
        int result = entityInfoMapper.insert(entityInfo);
        return result > 0;
    }

    @Override
    public Boolean delEntityInfo(String entityInfoId) {
        int result = entityInfoMapper.deleteById(entityInfoId);
        return result > 0;
    }

    @Override
    public Boolean updateEntityInfo(EntityInfo entityInfo) {
        int result = entityInfoMapper.updateById(entityInfo);
        return result > 0;
    }

    @Override
    public EntityInfo getEntityInfo(String entityInfoId) {
        EntityInfo entityInfo = entityInfoMapper.selectById(entityInfoId);
        return entityInfo;
    }
}
