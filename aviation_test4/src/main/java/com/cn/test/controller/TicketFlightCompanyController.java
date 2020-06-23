package com.cn.test.controller;

import com.cn.test.entity.TicketFlightCompany;
import com.cn.test.service.TicketFlightCompanyService;
import com.cn.test.service.TicketFlightService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketFlightCompanyController {
    @Autowired
    private TicketFlightCompanyService ticketFlightCompanyService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete")
    @ResponseBody
    public Return delete(int id){
        int i = ticketFlightCompanyService.deleteByPrimaryKey(id);
        res.setCode(i);
        res.setMsg("成功了");
        res.setTotal(0);
        res.setData(null);
        return res;
    }

    /**
     *航空公司按主键编辑
     * @param
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "edit",method = RequestMethod.POST)
    @ResponseBody
    public int edit(@RequestBody TicketFlightCompany record){
        return ticketFlightCompanyService.updateByPrimaryKey(record);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page")
    @ResponseBody
    public Return page(HttpServletRequest request){
        return getaReturn(request, ticketFlightCompanyService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketFlightCompanyService ticketFlightCompanyService, Return res) {
        Pager<TicketFlightCompany> pager = new Pager<TicketFlightCompany>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("curr")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("nums")));
        pager.setBigList(ticketFlightCompanyService.selectAll());
        TicketFlightCompany[] ticketFlightCompanies = pager.getSmallList().toArray(new TicketFlightCompany[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightCompanyService.count());
        res.setData(ticketFlightCompanies);
        return res;
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    @ResponseBody
    public int add(@RequestBody TicketFlightCompany record){
        return ticketFlightCompanyService.insert(record);
    }
}
