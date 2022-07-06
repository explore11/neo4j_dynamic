package com.hr.neo4j.controller;

import com.hr.neo4j.entity.EntityType;
import com.hr.neo4j.service.IEntityTypeService;
import com.hr.neo4j.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @since 2022-07-03
 */
@Api(tags = "接口")
@RestController
@RequestMapping("/neo4j/entity-type")
public class EntityTypeController {
    @Resource
    private IEntityTypeService entityTypeService;

    @GetMapping("/addEntityType")
    @ApiOperation(value = "添加entity-Type")
    public Result addEntityType(EntityType entityType) {
        Boolean result = entityTypeService.addEntityType(entityType);
        return Result.success(result);
    }

    @GetMapping("/delEntityType/{entityTypeId}")
    @ApiOperation(value = "删除entity-Type")
    public Result delEntityType(@PathVariable("entityTypeId") String entityTypeId) {
        Boolean result = entityTypeService.delEntityType(entityTypeId);
        return Result.success(result);
    }

    @GetMapping("/updateEntityType")
    @ApiOperation(value = "修改entity-Type")
    public Result updateEntityType(EntityType entityType) {
        Boolean result = entityTypeService.updateEntityType(entityType);
        return Result.success(result);
    }

    @GetMapping("/getEntityType/{entityTypeId}")
    @ApiOperation(value = "查询entity-Type")
    public Result getEntityType(@PathVariable("entityTypeId") String entityTypeId) {
        EntityType result = entityTypeService.getEntityType(entityTypeId);
        return Result.success(result);
    }


}

