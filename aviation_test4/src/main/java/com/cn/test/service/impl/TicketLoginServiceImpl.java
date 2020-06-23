package com.cn.test.service.impl;

import com.cn.test.dao.TicketLoginMapper;
import com.cn.test.entity.TicketLogin;
import com.cn.test.entity.TicketLoginExample;
import com.cn.test.service.TicketLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketLoginServiceImpl implements TicketLoginService {
    @Autowired
    private TicketLoginMapper ticketLoginMapper;

    public int countByExample(TicketLoginExample example) {
        return 0;
    }

    public int deleteByExample(TicketLoginExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketLoginMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketLogin record) {
        return ticketLoginMapper.insert(record);
    }

    public int insertSelective(TicketLogin record) {
        return 0;
    }

    public List<TicketLogin> selectByExample(TicketLoginExample example) {
        return null;
    }

    public TicketLogin selectByPrimaryKey(Integer id) {
        return null;
    }

    public int updateByExampleSelective(TicketLogin record, TicketLoginExample example) {
        return 0;
    }

    public int updateByExample(TicketLogin record, TicketLoginExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketLogin record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketLogin record) {
        return ticketLoginMapper.updateByPrimaryKey(record);
    }
}
