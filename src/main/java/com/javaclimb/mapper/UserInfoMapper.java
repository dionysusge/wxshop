package com.javaclimb.mapper;

import com.javaclimb.entity.UserInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;
import java.util.List;

/**
 *  用户相关的mapper
 *  */

@Repository
public interface UserInfoMapper extends Mapper<UserInfo> { // 继承父接口
    /* 根据用户名查询 */
    List<UserInfo> findByName(@Param("name") String name);
    /* 用户唯一性判断，哪一列，值是什么*/
    int checkRepeat(@Param("column") String column, @Param("value") String value);
}

