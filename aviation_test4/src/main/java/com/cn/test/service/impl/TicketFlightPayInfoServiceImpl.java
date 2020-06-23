package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightPayInfoMapper;
import com.cn.test.entity.TicketFlightPayInfo;
import com.cn.test.entity.TicketFlightPayInfoExample;
import com.cn.test.service.TicketFlightPayInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketFlightPayInfoServiceImpl implements TicketFlightPayInfoService {
    @Autowired
    private TicketFlightPayInfoMapper ticketFlightPayInfoMapper;

    public int countByExample(TicketFlightPayInfoExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightPayInfoExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightPayInfoMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlightPayInfo record) {
        return ticketFlightPayInfoMapper.insert(record);
    }

    public int insertSelective(TicketFlightPayInfo record) {
        return 0;
    }

    public List<TicketFlightPayInfo> selectByExample(TicketFlightPayInfoExample example) {
        return null;
    }

    public TicketFlightPayInfo selectByPrimaryKey(Integer id) {
        return null;
    }

    public List<TicketFlightPayInfo> selectAll() {
        List<TicketFlightPayInfo> list = ticketFlightPayInfoMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketFlightPayInfoMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketFlightPayInfo record, TicketFlightPayInfoExample example) {
        return 0;
    }

    public int updateByExample(TicketFlightPayInfo record, TicketFlightPayInfoExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlightPayInfo record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlightPayInfo record) {
        return ticketFlightPayInfoMapper.updateByPrimaryKey(record);
    }
}
