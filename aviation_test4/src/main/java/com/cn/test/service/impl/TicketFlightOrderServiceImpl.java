package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightOrderMapper;
import com.cn.test.entity.TicketFlightOrder;
import com.cn.test.entity.TicketFlightOrderExample;
import com.cn.test.service.TicketFlightOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketFlightOrderServiceImpl implements TicketFlightOrderService {
    @Autowired
    private TicketFlightOrderMapper ticketFlightOrderMapper;

    public int countByExample(TicketFlightOrderExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightOrderExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightOrderMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlightOrder record) {
        return ticketFlightOrderMapper.insert(record);
    }

    public int insertSelective(TicketFlightOrder record) {
        return 0;
    }

    public List<TicketFlightOrder> selectByExample(TicketFlightOrderExample example) {
        return null;
    }

    public TicketFlightOrder selectByPrimaryKey(Integer id) {
        return ticketFlightOrderMapper.selectByPrimaryKey(id);
    }

    public List<TicketFlightOrder> selectAll() {
        List<TicketFlightOrder> list = ticketFlightOrderMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketFlightOrderMapper.count();
        return count;
    }

    public int selectID() {
        return ticketFlightOrderMapper.selectID();
    }

    public int updateByExampleSelective(TicketFlightOrder record, TicketFlightOrderExample example) {
        return 0;
    }

    public int updateByExample(TicketFlightOrder record, TicketFlightOrderExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlightOrder record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlightOrder record) {
        return ticketFlightOrderMapper.updateByPrimaryKey(record);
    }
}
