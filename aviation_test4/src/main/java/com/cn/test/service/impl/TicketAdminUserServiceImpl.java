package com.cn.test.service.impl;

import com.cn.test.dao.TicketAdminUserMapper;
import com.cn.test.entity.TicketAdminUser;
import com.cn.test.entity.TicketAdminUserExample;
import com.cn.test.service.TicketAdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Administrator
 */
@Service
public class TicketAdminUserServiceImpl implements TicketAdminUserService {

    @Autowired
    private TicketAdminUserMapper ticketAdminUserMapper;

    public int countByExample(TicketAdminUserExample example) {
        return 0;
    }

    public int deleteByExample(TicketAdminUserExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(String username) {
        return ticketAdminUserMapper.deleteByPrimaryKey(username);
    }

    public int insert(TicketAdminUser record) {
        return ticketAdminUserMapper.insert(record);
    }

    public int insertSelective(TicketAdminUser record) {
        return 0;
    }

    public List<TicketAdminUser> selectByExample(TicketAdminUserExample example) {
        return null;
    }

    public TicketAdminUser selectByPrimaryKey(String username) {
        TicketAdminUser ticketAdminUser = ticketAdminUserMapper.selectByPrimaryKey(username);
        return ticketAdminUser;
    }

    public List<TicketAdminUser> selectAll() {
        List<TicketAdminUser> list = ticketAdminUserMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketAdminUserMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketAdminUser record, TicketAdminUserExample example) {
        return 0;
    }

    public int updateByExample(TicketAdminUser record, TicketAdminUserExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketAdminUser record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketAdminUser record) {
        return ticketAdminUserMapper.updateByPrimaryKey(record);
    }
}
