package com.cn.test.dao;

import com.cn.test.entity.Jing;

public interface JingMapper {
    int insert(Jing record);
    Jing selectByUsername(String username);
    int updateByPrimaryKeySelective(Jing record);
}
