package com.javaclimb.controller;

import com.github.pagehelper.PageInfo;
import com.javaclimb.common.Result;
import com.javaclimb.entity.GoodsInfo;
import com.javaclimb.service.GoodsInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*
* 商品增删改查控制器
* */

@RestController
@RequestMapping(value="/goodsInfo")
public class GoodsInfoController {

    @Resource
    private GoodsInfoService goodsInfoService;

    /**
     * 分页查询商品类别
     * @param pageNum 第几页
     * @param pageSize 每页大小
     * @param name 商品类别名
     * @return 返回一个用Result封装的信息
     * */
    @GetMapping("/page/{name}")
    public Result<PageInfo<GoodsInfo>> page(@RequestParam(defaultValue = "1") Integer pageNum,
                                           @RequestParam(defaultValue = "10") Integer pageSize,
                                           @PathVariable String name){
        return Result.success((goodsInfoService.findByPage(pageNum, pageSize, name)));
    }

    /**
     * 新增商品类别
     */
    @PostMapping
    public Result<GoodsInfo> add(@RequestBody GoodsInfo goodsInfo){
        goodsInfoService.add(goodsInfo);
        return Result.success(goodsInfo);
    }

    /**
     * 修改商品类别
     * */
    @PutMapping
    public Result<GoodsInfo> update(@RequestBody GoodsInfo goodsInfo){
        goodsInfoService.update(goodsInfo);
        return Result.success(goodsInfo);
    }

    /**
     * 删除商品，根据id
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){ // 噢那意思就是这个类型的变量可以映射到上面这个deleteMapping的地址，不过也要用{}括起来
        goodsInfoService.delete(id);
        return Result.success();
    }

    /**
     * 根据ID查询商品类别
     * */
    @GetMapping("/{id}")
    public Result detail(@PathVariable Long id){
        return Result.success(goodsInfoService.findById(id));
    }

    /**
     * 根据ID删除商品图片
     */
    @PostMapping("/clearImage/{id}")
    public Result clear(@PathVariable Long id){
        return Result.success(goodsInfoService.clearImageById(id));
    }
}
