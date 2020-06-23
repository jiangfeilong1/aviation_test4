package com.cn.test.controller;

import com.cn.test.entity.TicketAdminUser;
import com.cn.test.entity.TicketFlightCompany;
import com.cn.test.entity.TicketFlightConfig;
import com.cn.test.entity.TicketFlightPayInfo;
import com.cn.test.service.*;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Controller
public class TestController {
    @Autowired
    private TicketAdminUserService ticketAdminUserService;

    @Autowired
    private TicketFlightCompanyService ticketFlightCompanyService;

    @Autowired
    private TicketFlightConfigService ticketFlightConfigService;

    @Autowired
    private TicketFlightPayInfoService ticketFlightPayInfoService;

    @Autowired
    private TicketFlightPlaneService ticketFlightPlaneService;

    @Autowired
    private TicketFlightTouristService ticketFlightTouristService;

    @Autowired
    private TicketHelpService ticketHelpService;

    @Autowired
    private TicketNewsService ticketNewsService;

    @Autowired
    private TicketTotalInfoService ticketTotalInfoService;

    Return res = new Return();



}
