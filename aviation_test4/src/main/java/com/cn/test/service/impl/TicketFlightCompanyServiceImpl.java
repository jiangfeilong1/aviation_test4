package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightCompanyMapper;
import com.cn.test.entity.TicketFlightCompany;
import com.cn.test.entity.TicketFlightCompanyExample;
import com.cn.test.service.TicketFlightCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Administrator
 */
@Service
public class TicketFlightCompanyServiceImpl implements TicketFlightCompanyService {
    @Autowired
    private TicketFlightCompanyMapper ticketFlightCompanyMapper;

    public int countByExample(TicketFlightCompanyExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightCompanyExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightCompanyMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlightCompany record) {
        return ticketFlightCompanyMapper.insert(record);
    }

    public int insertSelective(TicketFlightCompany record) {
        return 0;
    }

    public List<TicketFlightCompany> selectByExample(TicketFlightCompanyExample example) {
        return null;
    }

    public List<TicketFlightCompany> selectAll() {
        List<TicketFlightCompany> list = ticketFlightCompanyMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketFlightCompanyMapper.count();
        return count;
    }

    public TicketFlightCompany selectByPrimaryKey(Integer id) {
        return ticketFlightCompanyMapper.selectByPrimaryKey(id);
    }

    public int updateByExampleSelective(TicketFlightCompany record, TicketFlightCompanyExample example) {
        return 0;
    }

    public int updateByExample(TicketFlightCompany record, TicketFlightCompanyExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlightCompany record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlightCompany record) {
        return ticketFlightCompanyMapper.updateByPrimaryKey(record);
    }
}
