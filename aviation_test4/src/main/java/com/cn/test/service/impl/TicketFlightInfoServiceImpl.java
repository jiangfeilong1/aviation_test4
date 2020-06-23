package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightInfoMapper;
import com.cn.test.entity.TicketFlightInfo;
import com.cn.test.entity.TicketFlightInfoExample;
import com.cn.test.service.TicketFlightInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketFlightInfoServiceImpl implements TicketFlightInfoService {
    @Autowired
    private TicketFlightInfoMapper ticketFlightInfoMapper;

    public int countByExample(TicketFlightInfoExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightInfoExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightInfoMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlightInfo record) {
        return ticketFlightInfoMapper.insert(record);
    }

    public int insertSelective(TicketFlightInfo record) {
        return ticketFlightInfoMapper.insertSelective(record);
    }

    public List<TicketFlightInfo> selectByExample(TicketFlightInfoExample example) {
        return null;
    }

    public TicketFlightInfo selectByPrimaryKey(Integer id) {
        return ticketFlightInfoMapper.selectByPrimaryKey(id);
    }

    public TicketFlightInfo[] selectByDate(Date date) {
        return ticketFlightInfoMapper.selectByDate(date);
    }

    public List<TicketFlightInfo> selectAll() {
        List<TicketFlightInfo> list = ticketFlightInfoMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketFlightInfoMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketFlightInfo record, TicketFlightInfoExample example) {
        return 0;
    }

    public int updateByExample(TicketFlightInfo record, TicketFlightInfoExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlightInfo record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlightInfo record) {
        return ticketFlightInfoMapper.updateByPrimaryKey(record);
    }
}
