package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightPlaneMapper;
import com.cn.test.entity.TicketFlightPlane;
import com.cn.test.entity.TicketFlightPlaneExample;
import com.cn.test.service.TicketFlightPlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketFlightPlaneServiceImpl implements TicketFlightPlaneService {
    @Autowired
    private TicketFlightPlaneMapper ticketFlightPlaneMapper;

    public int countByExample(TicketFlightPlaneExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightPlaneExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightPlaneMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlightPlane record) {
        return ticketFlightPlaneMapper.insert(record);
    }

    public int insertSelective(TicketFlightPlane record) {
        return 0;
    }

    public List<TicketFlightPlane> selectByExample(TicketFlightPlaneExample example) {
        return null;
    }

    public TicketFlightPlane selectByPrimaryKey(Integer id) {
        return ticketFlightPlaneMapper.selectByPrimaryKey(id);
    }

    public List<TicketFlightPlane> selectAll() {
        List<TicketFlightPlane> list = ticketFlightPlaneMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketFlightPlaneMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketFlightPlane record, TicketFlightPlaneExample example) {
        return 0;
    }

    public int updateByExample(TicketFlightPlane record, TicketFlightPlaneExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlightPlane record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlightPlane record) {
        return ticketFlightPlaneMapper.updateByPrimaryKey(record);
    }
}
