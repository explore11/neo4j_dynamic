package com.hr.neo4j.controller;

import com.hr.neo4j.service.IEntityPropertyService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @since 2022-07-03
 */
@Api(tags = "接口")
@RestController
@RequestMapping("/neo4j/entity-property")
public class EntityPropertyController {
    @Autowired
    private IEntityPropertyService entityPropertyService;


}

