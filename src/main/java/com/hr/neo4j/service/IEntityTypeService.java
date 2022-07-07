package com.hr.neo4j.service;

import com.hr.neo4j.entity.EntityType;
import com.hr.neo4j.entity.EntityTypeTree;

import java.util.List;

/**
 * @since 2022-07-03
 */
public interface IEntityTypeService {


    Boolean addEntityType(EntityType entityType);

    Boolean delEntityType(String entityTypeId);

    Boolean updateEntityType(EntityType entityType);

    EntityType getEntityType(String entityTypeId);

    List<EntityType> getEntityTypeTree();


}
