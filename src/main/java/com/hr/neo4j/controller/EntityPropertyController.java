package com.hr.neo4j.controller;

import com.hr.neo4j.entity.EntityProperty;
import com.hr.neo4j.service.IEntityPropertyService;
import com.hr.neo4j.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @since 2022-07-03
 */
@Api(tags = "entity-property")
@RestController
@RequestMapping("/neo4j/entity-property")
public class EntityPropertyController {
    @Resource
    private IEntityPropertyService entityPropertyService;

    @GetMapping("/addEntityProperty")
    @ApiOperation(value = "添加entity-property")
    public Result addEntityProperty(@RequestBody EntityProperty entityProperty) {
        Boolean result = entityPropertyService.addEntityProperty(entityProperty);
        return Result.success(result);
    }

    @GetMapping("/delEntityProperty/{entityPropertyId}")
    @ApiOperation(value = "删除entity-property")
    public Result delEntityProperty(@PathVariable("entityPropertyId") String entityPropertyId) {
        Boolean result = entityPropertyService.delEntityProperty(entityPropertyId);
        return Result.success(result);
    }

    @GetMapping("/updateEntityProperty")
    @ApiOperation(value = "修改entity-property")
    public Result updateEntityProperty(@RequestBody EntityProperty entityProperty) {
        Boolean result = entityPropertyService.updateEntityProperty(entityProperty);
        return Result.success(result);
    }

    @GetMapping("/getEntityProperty/{entityPropertyId}")
    @ApiOperation(value = "查询entity-property")
    public Result getEntityProperty(@PathVariable("entityPropertyId") String entityPropertyId) {
        EntityProperty result = entityPropertyService.getEntityProperty(entityPropertyId);
        return Result.success(result);
    }


}

