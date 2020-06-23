package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightTouristMapper;
import com.cn.test.entity.TicketFlightTourist;
import com.cn.test.entity.TicketFlightTouristExample;
import com.cn.test.service.TicketFlightTouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketFlightTouristServiceImpl implements TicketFlightTouristService {
    @Autowired
    private TicketFlightTouristMapper ticketFlightTouristMapper;

    public int countByExample(TicketFlightTouristExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightTouristExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightTouristMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlightTourist record) {
        return ticketFlightTouristMapper.insert(record);
    }

    public int insertSelective(TicketFlightTourist record) {
        return 0;
    }

    public List<TicketFlightTourist> selectByExample(TicketFlightTouristExample example) {
        return null;
    }

    public TicketFlightTourist selectByPrimaryKey(Integer id) {
        return ticketFlightTouristMapper.selectByPrimaryKey(id);
    }

    public List<TicketFlightTourist> selectAll() {
        List<TicketFlightTourist> list = ticketFlightTouristMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketFlightTouristMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketFlightTourist record, TicketFlightTouristExample example) {
        return 0;
    }

    public int updateByExample(TicketFlightTourist record, TicketFlightTouristExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlightTourist record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlightTourist record) {
        return ticketFlightTouristMapper.updateByPrimaryKey(record);
    }
}
