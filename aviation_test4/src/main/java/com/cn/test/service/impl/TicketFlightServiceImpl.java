package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightCompanyMapper;
import com.cn.test.dao.TicketFlightMapper;
import com.cn.test.dao.TicketFlightPlaneMapper;
import com.cn.test.entity.TicketFlight;
import com.cn.test.entity.TicketFlightCompany;
import com.cn.test.entity.TicketFlightExample;
import com.cn.test.entity.TicketFlightPlane;
import com.cn.test.service.TicketFlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketFlightServiceImpl implements TicketFlightService {
    @Autowired
    private TicketFlightMapper ticketFlightMapper;

    @Autowired
    private TicketFlightPlaneMapper ticketFlightPlaneMapper;

    @Autowired
    private TicketFlightCompanyMapper ticketFlightCompanyMapper;

    public int countByExample(TicketFlightExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlight record) {
        return ticketFlightMapper.insert(record);
    }

    public int insertSelective(TicketFlight record) {
        return 0;
    }

    public List<TicketFlight> selectByExample(TicketFlightExample example) {
        return null;
    }

    public List<TicketFlight> selectByDate(Date startdate, Date enddate, String start, String destination) {
        return ticketFlightMapper.selectByDate(startdate,enddate,start,destination);
    }

    public TicketFlight selectByPrimaryKey(Integer id) {
        return ticketFlightMapper.selectByPrimaryKey(id);
    }

    public List<TicketFlight> selectAll() {
        List<TicketFlight> list = ticketFlightMapper.selectAll();
        for (int i = 0; i < list.size(); i++){
            TicketFlight ticketFlight = list.get(i);
            Integer a = ticketFlight.getFlightcompony();
            Integer b = ticketFlight.getPlane();
            TicketFlightCompany ticketFlightCompany = ticketFlightCompanyMapper.selectByPrimaryKey(a);
            TicketFlightPlane ticketFlightPlane = ticketFlightPlaneMapper.selectByPrimaryKey(b);
            String c = ticketFlightCompany.getName();
            String d = ticketFlightPlane.getName();
        }
        return list;
    }

    public int count() {
        int count = ticketFlightMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketFlight record, TicketFlightExample example) {
        return 0;
    }

    public int updateByExample(TicketFlight record, TicketFlightExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlight record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlight record) {
        return ticketFlightMapper.updateByPrimaryKey(record);
    }
}
