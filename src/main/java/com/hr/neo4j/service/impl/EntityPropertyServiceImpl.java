package com.hr.neo4j.service.impl;

import com.hr.neo4j.entity.EntityProperty;
import com.hr.neo4j.mapper.EntityPropertyMapper;
import com.hr.neo4j.service.IEntityPropertyService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @since 2022-07-03
 */
@Service
public class EntityPropertyServiceImpl implements IEntityPropertyService {

    @Resource
    private EntityPropertyMapper entityPropertyMapper;


    @Override
    public Boolean addEntityProperty(EntityProperty entityProperty) {
        return entityPropertyMapper.insert(entityProperty) > 0;
    }

    @Override
    public Boolean delEntityProperty(String entityPropertyId) {
        return entityPropertyMapper.deleteById(entityPropertyId) > 0;
    }

    @Override
    public Boolean updateEntityProperty(EntityProperty entityProperty) {
        return entityPropertyMapper.updateById(entityProperty) > 0;
    }

    @Override
    public EntityProperty getEntityProperty(String entityPropertyId) {
        return entityPropertyMapper.selectById(entityPropertyId);
    }
}
