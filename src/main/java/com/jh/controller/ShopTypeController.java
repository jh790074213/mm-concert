package com.jh.controller;


import com.jh.dto.Result;
import com.jh.entity.ShopType;
import com.jh.service.IShopTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author jh
 */
@RestController
@RequestMapping("/shop-type")
public class ShopTypeController {
    @Resource
    private IShopTypeService typeService;

    @GetMapping("list")
    public Result queryTypeList() {
        // List<ShopType> typeList = typeService.query().orderByAsc("sort").list();
        List<ShopType> typeList = typeService.queryType();
        return Result.ok(typeList);
    }
}
