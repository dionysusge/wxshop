package com.javaclimb.mapper;

import com.javaclimb.entity.NxSystemFileInfo;
import com.javaclimb.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface NxSystemFileInfoMapper extends Mapper<NxSystemFileInfo> {
    /* 根据文件ID删除 */
    List<UserInfo> deleteById(@Param("id") Long id);
}