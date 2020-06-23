package com.cn.test.service;

import com.cn.test.entity.Jing;

public interface JingService {
    int insert(Jing record);
    Jing selectByUsername(String username);
    int updateByPrimaryKeySelective(Jing record);
}
