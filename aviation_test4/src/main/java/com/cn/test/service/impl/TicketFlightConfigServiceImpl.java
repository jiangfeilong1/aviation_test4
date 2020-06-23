package com.cn.test.service.impl;

import com.cn.test.dao.TicketFlightConfigMapper;
import com.cn.test.entity.TicketFlightConfig;
import com.cn.test.entity.TicketFlightConfigExample;
import com.cn.test.service.TicketFlightConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author Administrator
 */
@Service
public class TicketFlightConfigServiceImpl implements TicketFlightConfigService {
    @Autowired
    private TicketFlightConfigMapper ticketFlightConfigMapper;

    public int countByExample(TicketFlightConfigExample example) {
        return 0;
    }

    public int deleteByExample(TicketFlightConfigExample example) {
        return 0;
    }

    public int deleteByPrimaryKey(Integer id) {
        return ticketFlightConfigMapper.deleteByPrimaryKey(id);
    }

    public int insert(TicketFlightConfig record) {
        return ticketFlightConfigMapper.insert(record);
    }

    public int insertSelective(TicketFlightConfig record) {
        return ticketFlightConfigMapper.insertSelective(record);
    }

    public List<TicketFlightConfig> selectByExample(TicketFlightConfigExample example) {
        return null;
    }

    public TicketFlightConfig selectByPrimaryKey(Integer id) {
        return null;
    }

    public List<TicketFlightConfig> selectAll() {
        List<TicketFlightConfig> list = ticketFlightConfigMapper.selectAll();
        return list;
    }

    public int count() {
        int count = ticketFlightConfigMapper.count();
        return count;
    }

    public int updateByExampleSelective(TicketFlightConfig record, TicketFlightConfigExample example) {
        return 0;
    }

    public int updateByExample(TicketFlightConfig record, TicketFlightConfigExample example) {
        return 0;
    }

    public int updateByPrimaryKeySelective(TicketFlightConfig record) {
        return 0;
    }

    public int updateByPrimaryKey(TicketFlightConfig record) {
        return ticketFlightConfigMapper.updateByPrimaryKey(record);
    }
}
