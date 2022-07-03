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


}
