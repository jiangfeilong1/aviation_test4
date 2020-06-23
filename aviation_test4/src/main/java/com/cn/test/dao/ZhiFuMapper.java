package com.cn.test.dao;

import com.cn.test.entity.ZhiFu;

public interface ZhiFuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ZhiFu record);

    int insertSelective(ZhiFu record);

    ZhiFu selectByPrimaryKey(Integer id);

    ZhiFu[] selectByUsername(String username);

    ZhiFu[] selectAll();

    ZhiFu[] selectByZhuangTai(String zhuangtai);

    int updateByPrimaryKeySelective(ZhiFu record);

    int updateByPrimaryKey(ZhiFu record);
}
