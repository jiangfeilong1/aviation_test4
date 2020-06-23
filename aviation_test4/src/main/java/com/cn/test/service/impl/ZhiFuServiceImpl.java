package com.cn.test.service.impl;

import com.cn.test.dao.ZhiFuMapper;
import com.cn.test.entity.ZhiFu;
import com.cn.test.service.ZhiFuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Service
public class ZhiFuServiceImpl implements ZhiFuService {

    @Autowired
    private ZhiFuMapper zhiFuMapper;

    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    public int insert(ZhiFu record) {
        return zhiFuMapper.insert(record);
    }

    public int insertSelective(ZhiFu record) {
        return 0;
    }

    public ZhiFu selectByPrimaryKey(Integer id) {
        return zhiFuMapper.selectByPrimaryKey(id);
    }

    public ZhiFu[] selectByUsername(String username) {
        return zhiFuMapper.selectByUsername(username);
    }

    public ZhiFu[] selectByZhuangTai(String zhuangtai) {
        return zhiFuMapper.selectByZhuangTai(zhuangtai);
    }

    public ZhiFu[] selectAll() {
        return zhiFuMapper.selectAll();
    }

    public int updateByPrimaryKeySelective(ZhiFu record) {
        return zhiFuMapper.updateByPrimaryKeySelective(record);
    }

    public int updateByPrimaryKey(ZhiFu record) {
        return zhiFuMapper.updateByPrimaryKey(record);
    }
}
