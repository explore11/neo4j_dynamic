package com.hr.neo4j.service;

import com.hr.neo4j.entity.EntityProperty;

/**
 * @since 2022-07-03
 */
public interface IEntityPropertyService {


    Boolean addEntityProperty(EntityProperty entityProperty);

    Boolean delEntityProperty(String entityPropertyId);

    Boolean updateEntityProperty(EntityProperty entityProperty);

    EntityProperty getEntityProperty(String entityPropertyId);
}
