package com.cn.test.service.impl;

import com.cn.test.dao.TicketHelpMapper;
import com.cn.test.entity.TicketHelp;
import com.cn.test.entity.TicketHelpExample;
import com.cn.test.service.TicketHelpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketHelpServiceImpl implements TicketHelpService {
    @Autowired
    private TicketHelpMapper ticketHelpMapper;

    public int countByExample(TicketHelpExample example) {
        return 0;
    }

    public int deleteByExample(TicketHelpExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketHelpMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketHelp record) {
        return ticketHelpMapper.insert(record);
    }

    public int insertSelective(TicketHelp record) {
        return 0;
    }

    public List<TicketHelp> selectByExample(TicketHelpExample example) {
        return null;
    }

    public TicketHelp selectByPrimaryKey(Integer id) {
        return null;
    }

    public List<TicketHelp> selectAll() {
        List<TicketHelp> list = ticketHelpMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketHelpMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketHelp record, TicketHelpExample example) {
        return 0;
    }

    public int updateByExample(TicketHelp record, TicketHelpExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketHelp record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketHelp record) {
        return ticketHelpMapper.updateByPrimaryKey(record);
    }
}
