package com.cn.test.service.impl;

import com.cn.test.dao.JingMapper;
import com.cn.test.entity.Jing;
import com.cn.test.service.JingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JingServiceImpl implements JingService {
    @Autowired
    private JingMapper jingMapper;

    public int insert(Jing record) {
        return jingMapper.insert(record);
    }

    public Jing selectByUsername(String username) {
        return jingMapper.selectByUsername(username);
    }

    public int updateByPrimaryKeySelective(Jing record) {
        return jingMapper.updateByPrimaryKeySelective(record);
    }
}
