package com.cn.test.service.impl;

import com.cn.test.dao.TicketUserMapper;
import com.cn.test.entity.TicketUser;
import com.cn.test.entity.TicketUserExample;
import com.cn.test.service.TicketUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketUserServiceImpl implements TicketUserService {
    @Autowired
    private TicketUserMapper ticketUserMapper;

    public int countByExample(TicketUserExample example) {
        return 0;
    }

    public int deleteByExample(TicketUserExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(String username) {
        return ticketUserMapper.deleteByPrimaryKey(username);
    }

    public int insert(TicketUser record) {
        return ticketUserMapper.insert(record);
    }

    public int insertSelective(TicketUser record) {
        return 0;
    }

    public List<TicketUser> selectByExample(TicketUserExample example) {
        return null;
    }

    public TicketUser selectByPrimaryKey(String username) {
        return ticketUserMapper.selectByPrimaryKey(username);
    }

    public List<TicketUser> selectAll() {
        List<TicketUser> list = ticketUserMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketUserMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketUser record, TicketUserExample example) {
        return 0;
    }

    public int updateByExample(TicketUser record, TicketUserExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketUser record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketUser record) {
        return ticketUserMapper.updateByPrimaryKey(record);
    }
}
