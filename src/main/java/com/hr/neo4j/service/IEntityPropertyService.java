package com.hr.neo4j.service;

import com.hr.neo4j.entity.EntityProperty;

import java.util.List;

/**
 * @since 2022-07-03
 */
public interface IEntityPropertyService {


    Boolean addEntityProperty(EntityProperty entityProperty);

    Boolean delEntityProperty(String entityPropertyId);

    Boolean updateEntityProperty(EntityProperty entityProperty);

    EntityProperty getEntityProperty(String entityPropertyId);

    List<EntityProperty> getEntityPropertyByEntityTypeId(String entityTypeId);

}
