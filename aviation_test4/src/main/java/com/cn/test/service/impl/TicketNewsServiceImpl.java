package com.cn.test.service.impl;

import com.cn.test.dao.TicketNewsMapper;
import com.cn.test.entity.TicketNews;
import com.cn.test.entity.TicketNewsExample;
import com.cn.test.service.TicketNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketNewsServiceImpl implements TicketNewsService {
    @Autowired
    private TicketNewsMapper ticketNewsMapper;

    public int countByExample(TicketNewsExample example) {
        return 0;
    }

    public int deleteByExample(TicketNewsExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketNewsMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketNews record) {
        return ticketNewsMapper.insert(record);
    }

    public int insertSelective(TicketNews record) {
        return 0;
    }

    public List<TicketNews> selectByExample(TicketNewsExample example) {
        return null;
    }

    public TicketNews selectByPrimaryKey(Integer id) {
        return null;
    }

    public List<TicketNews> selectAll() {
        List<TicketNews> list = ticketNewsMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketNewsMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketNews record, TicketNewsExample example) {
        return 0;
    }

    public int updateByExample(TicketNews record, TicketNewsExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketNews record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketNews record) {
        return ticketNewsMapper.updateByPrimaryKey(record);
    }
}
