package com.hr.neo4j.service.impl;

import com.hr.neo4j.entity.EntityType;
import com.hr.neo4j.mapper.EntityTypeMapper;
import com.hr.neo4j.service.IEntityTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @since 2022-07-03
 */
@Service
public class EntityTypeServiceImpl implements IEntityTypeService {

    @Resource
    private EntityTypeMapper entityTypeMapper;


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
