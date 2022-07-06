package com.hr.neo4j.service;

import com.hr.neo4j.entity.EntityInfo;

/**
 * @since 2022-07-03
 */
public interface IEntityInfoService {


    Boolean addEntityInfo(EntityInfo entityInfo);

    Boolean delEntityInfo(String entityInfoId);

    Boolean updateEntityInfo(EntityInfo entityInfo);

    EntityInfo getEntityInfo(String entityInfoId);
}
