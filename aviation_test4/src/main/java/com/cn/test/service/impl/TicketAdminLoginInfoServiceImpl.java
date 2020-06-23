package com.cn.test.service.impl;

import com.cn.test.dao.TicketAdminLoginInfoMapper;
import com.cn.test.entity.TicketAdminLoginInfo;
import com.cn.test.entity.TicketAdminLoginInfoExample;
import com.cn.test.service.TicketAdminLoginInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketAdminLoginInfoServiceImpl implements TicketAdminLoginInfoService {
    @Autowired
    public TicketAdminLoginInfoMapper ticketAdminLoginInfoMapper;

    public int countByExample(TicketAdminLoginInfoExample example) {
        return 0;
    }

    public int deleteByExample(TicketAdminLoginInfoExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        ticketAdminLoginInfoMapper.deleteByPrimaryKey(id);
        return 0;
    }

    public int insert(TicketAdminLoginInfo record) {
        ticketAdminLoginInfoMapper.insert(record);
        return 0;
    }

    public int insertSelective(TicketAdminLoginInfo record) {
        return 0;
    }

    public List<TicketAdminLoginInfo> selectByExample(TicketAdminLoginInfoExample example) {
        List<TicketAdminLoginInfo> list = ticketAdminLoginInfoMapper.selectByExample(example);
        return list;
    }

    public TicketAdminLoginInfo selectByPrimaryKey(Integer id) {
        return ticketAdminLoginInfoMapper.selectByPrimaryKey(id);
    }

    public List<TicketAdminLoginInfo> selectAll() {
        List<TicketAdminLoginInfo> list = ticketAdminLoginInfoMapper.selectAll();
        return list;
    }

    public int count() {
        return ticketAdminLoginInfoMapper.count();
    }

    public int updateByExampleSelective(TicketAdminLoginInfo record, TicketAdminLoginInfoExample example) {
        return 0;
    }

    public int updateByExample(TicketAdminLoginInfo record, TicketAdminLoginInfoExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketAdminLoginInfo record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketAdminLoginInfo record) {
        return ticketAdminLoginInfoMapper.updateByPrimaryKey(record);
    }

    public List<TicketAdminLoginInfo> findAll() {
        return ticketAdminLoginInfoMapper.findAll();
    }
}
