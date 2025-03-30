package com.javaclimb.mapper;

import com.javaclimb.entity.GoodsTypeInfo;
import com.javaclimb.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface GoodsTypeInfoMapper extends Mapper<GoodsTypeInfo> {
    /* 根据类名查询 */
    List<GoodsTypeInfo> findByName(@Param("name") String name);
}