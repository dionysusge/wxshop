package com.javaclimb.controller;

import com.github.pagehelper.PageInfo;
import com.javaclimb.common.Result;
import com.javaclimb.entity.UserInfo;
import com.javaclimb.service.UserInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*
* 用户增删改查控制器
* */

@RestController
@RequestMapping(value="/userInfo")
public class UserInfoController {

    @Resource
    private UserInfoService userInfoService;

    /**
     * 分页查询用户列表
     * @param pageNum 第几页
     * @param pageSize 每页大小
     * @param name 用户名
     * @return 返回一个用Result封装的信息
     * */
    @GetMapping("/page/{name}")
    public Result<PageInfo<UserInfo>> page(@RequestParam(defaultValue = "1") Integer pageNum,
                                           @RequestParam(defaultValue = "10") Integer pageSize,
                                           @PathVariable String name){
        return Result.success((userInfoService.findByPage(pageNum, pageSize, name)));
    }

    /**
     * 新增用户
     */
    @PostMapping
    public Result<UserInfo> add(@RequestBody UserInfo userInfo){
        userInfoService.add(userInfo);
        return Result.success(userInfo);
    }

    /**
     * 修改用户
     * */
    @PutMapping
    public Result<UserInfo> update(@RequestBody UserInfo userInfo){
        userInfoService.update(userInfo);
        return Result.success(userInfo);
    }

    /**
     * 删除用户，根据id
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){ // 噢那意思就是这个类型的变量可以映射到上面这个deleteMapping的地址，不过也要用{}括起来
        userInfoService.delete(id);
        return Result.success();
    }
}
