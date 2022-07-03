package com.hr.neo4j.service.impl;

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


}
