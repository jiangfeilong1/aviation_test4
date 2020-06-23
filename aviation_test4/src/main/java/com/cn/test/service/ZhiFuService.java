package com.cn.test.service;

import com.cn.test.entity.ZhiFu;

public interface ZhiFuService {
    int deleteByPrimaryKey(Integer id);

    int insert(ZhiFu record);

    int insertSelective(ZhiFu record);

    ZhiFu selectByPrimaryKey(Integer id);

    ZhiFu[] selectByUsername(String username);

    ZhiFu[] selectByZhuangTai(String zhuangtai);

    ZhiFu[] selectAll();

    int updateByPrimaryKeySelective(ZhiFu record);

    int updateByPrimaryKey(ZhiFu record);
}
