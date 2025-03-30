package com.javaclimb.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.javaclimb.entity.GoodsTypeInfo;
import com.javaclimb.mapper.GoodsTypeInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
* 商品类别相关的service
* */
@Service
public class GoodsTypeInfoService {

    @Resource
    private GoodsTypeInfoMapper goodsTypeInfoMapper;

    

    /*
    * 分页查询商品类别列表
    * */
    public PageInfo<GoodsTypeInfo> findByPage(Integer pageNum, Integer pageSize, String name){
        PageHelper.startPage(pageNum, pageSize);
        List<GoodsTypeInfo> list = goodsTypeInfoMapper.findByName(name);
        return PageInfo.of(list);
    }

    /**
     * 新增商品类别
     * */

    public GoodsTypeInfo add(GoodsTypeInfo goodsTypeInfo){
        goodsTypeInfoMapper.insertSelective(goodsTypeInfo);
        return goodsTypeInfo;
    }

    /**
     * 修改商品类别
     */
    public void update(GoodsTypeInfo goodsTypeInfo){
        goodsTypeInfoMapper.updateByPrimaryKeySelective(goodsTypeInfo);
    }

    /**
     * 根据ID删除商品类别
     */
    public void delete(Long id){
        goodsTypeInfoMapper.deleteByPrimaryKey(id);
    }

    /**
     * 根据ID查询商品类别
     */
    public GoodsTypeInfo findById(Long id){
        return goodsTypeInfoMapper.selectByPrimaryKey(id);
    }
}

