package com.javaclimb.controller;

import com.github.pagehelper.PageInfo;
import com.javaclimb.common.Result;
import com.javaclimb.entity.AnnouncementInfo;
import com.javaclimb.service.AnnouncementInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/*
* 公告增删改查控制器
* */

@RestController
@RequestMapping(value="/announcementInfo")
public class AnnouncementInfoController {

    @Resource
    private AnnouncementInfoService announcementInfoService;

    /**
     * 分页查询公告列表
     * @param pageNum 第几页
     * @param pageSize 每页大小
     * @param name 公告名
     * @return 返回一个用Result封装的信息
     * */
    @GetMapping("/page/{name}")
    public Result<PageInfo<AnnouncementInfo>> page(@RequestParam(defaultValue = "1") Integer pageNum,
                                           @RequestParam(defaultValue = "10") Integer pageSize,
                                           @PathVariable String name){
        return Result.success((announcementInfoService.findByPage(pageNum, pageSize, name)));
    }

    /**
     * 新增公告
     */
    @PostMapping
    public Result<AnnouncementInfo> add(@RequestBody AnnouncementInfo announcementInfo){
        announcementInfoService.add(announcementInfo);
        return Result.success(announcementInfo);
    }

    /**
     * 修改公告
     * */
    @PutMapping
    public Result<AnnouncementInfo> update(@RequestBody AnnouncementInfo announcementInfo){
        announcementInfoService.update(announcementInfo);
        return Result.success(announcementInfo);
    }

    /**
     * 删除公告，根据id
     */
    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Long id){ // 噢那意思就是这个类型的变量可以映射到上面这个deleteMapping的地址，不过也要用{}括起来
        announcementInfoService.delete(id);
        return Result.success();
    }

    /**
     * 根据ID查询公告
     * */
    @GetMapping("/{id}")
    public Result detail(@PathVariable Long id){
        return Result.success(announcementInfoService.findById(id));
    }
}
