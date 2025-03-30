package com.javaclimb.mapper;

import com.javaclimb.entity.AnnouncementInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface AnnouncementInfoMapper extends Mapper<AnnouncementInfo> {
    /*根据公告标题模糊查询*/
    List<AnnouncementInfo> findByName(@Param("name") String name);
}