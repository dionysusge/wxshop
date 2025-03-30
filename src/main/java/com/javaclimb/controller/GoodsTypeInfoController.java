package com.javaclimb.controller;

import com.github.pagehelper.PageInfo;
import com.javaclimb.common.Result;
import com.javaclimb.entity.GoodsTypeInfo;
import com.javaclimb.service.GoodsTypeInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*
* 商品类别增删改查控制器
* */

@RestController
@RequestMapping(value="/goodsTypeInfo")
public class GoodsTypeInfoController {

    @Resource
    private GoodsTypeInfoService goodsTypeInfoService;

    /**
     * 分页查询商品类别
     * @param pageNum 第几页
     * @param pageSize 每页大小
     * @param name 商品类别名
     * @return 返回一个用Result封装的信息
     * */
    @GetMapping("/page/{name}")
    public Result<PageInfo<GoodsTypeInfo>> page(@RequestParam(defaultValue = "1") Integer pageNum,
                                           @RequestParam(defaultValue = "10") Integer pageSize,
                                           @PathVariable String name){
        return Result.success((goodsTypeInfoService.findByPage(pageNum, pageSize, name)));
    }

    /**
     * 新增商品类别
     */
    @PostMapping
    public Result<GoodsTypeInfo> add(@RequestBody GoodsTypeInfo goodsTypeInfo){
        goodsTypeInfoService.add(goodsTypeInfo);
        return Result.success(goodsTypeInfo);
    }

    /**
     * 修改商品类别
     * */
    @PutMapping
    public Result<GoodsTypeInfo> update(@RequestBody GoodsTypeInfo goodsTypeInfo){
        goodsTypeInfoService.update(goodsTypeInfo);
        return Result.success(goodsTypeInfo);
    }

    /**
     * 删除商品类别，根据id
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){ // 噢那意思就是这个类型的变量可以映射到上面这个deleteMapping的地址，不过也要用{}括起来
        goodsTypeInfoService.delete(id);
        return Result.success();
    }

    /**
     * 根据ID查询商品类别
     * */
    @GetMapping("/{id}")
    public Result detail(@PathVariable Long id){
        return Result.success(goodsTypeInfoService.findById(id));
    }
}
