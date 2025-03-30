package com.javaclimb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javaclimb.entity.AnnouncementInfo;
import com.javaclimb.mapper.AnnouncementInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*
* 公告相关的service
* */
@Service
public class AnnouncementInfoService {

    @Resource
    private AnnouncementInfoMapper announcementInfoMapper;

    /*
    * 分页查询公告列表
    * */
    public PageInfo<AnnouncementInfo> findByPage(Integer pageNum, Integer pageSize, String name){
        PageHelper.startPage(pageNum, pageSize);
        List<AnnouncementInfo> list = announcementInfoMapper.findByName(name);
        return PageInfo.of(list);
    }

    /**
     * 新增公告
     * */

    public AnnouncementInfo add(AnnouncementInfo announcementInfo){
        announcementInfo.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        announcementInfoMapper.insertSelective(announcementInfo);
        return announcementInfo;
    }

    /**
     * 修改公告
     */
    public void update(AnnouncementInfo announcementInfo){
        announcementInfo.setTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        announcementInfoMapper.updateByPrimaryKeySelective(announcementInfo);
    }

    /**
     * 根据ID删除公告
     */
    public void delete(Long id){
        announcementInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据ID查询一条公告
     * */
    public AnnouncementInfo findById(Long id){
        return announcementInfoMapper.selectByPrimaryKey(id);
    }
}

