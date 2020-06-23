package com.cn.test.controller;

import com.cn.test.entity.TicketFlightPlane;
import com.cn.test.service.TicketFlightPlaneService;
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
public class TicketFlightPlaneController {
    @Autowired
    private TicketFlightPlaneService ticketFlightPlaneService;

    Return res = new Return();

    /**
     *航班班机按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "delete1")
    @ResponseBody
    public Return delete1(int id){
        int i = ticketFlightPlaneService.deleteByPrimaryKey(id);
        res.setCode(i);
        res.setMsg("成功了");
        res.setTotal(0);
        res.setData(null);
        return res;
    }

    /**
     *航班班机按主键编辑
     * @param
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "edit1",method = RequestMethod.POST)
    @ResponseBody
    public int edit1(@RequestBody TicketFlightPlane record){
        return ticketFlightPlaneService.updateByPrimaryKey(record);
    }

    /**
     *航班班机分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\progress\index.html
     */
    @RequestMapping(value = "page1")
    @ResponseBody
    public Return page1(HttpServletRequest request){
        return getaReturn(request, ticketFlightPlaneService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketFlightPlaneService ticketFlightPlaneService, Return res) {
        Pager<TicketFlightPlane> pager = new Pager<TicketFlightPlane>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketFlightPlaneService.selectAll());
        TicketFlightPlane[] ticketFlightPlanes = pager.getSmallList().toArray(new TicketFlightPlane[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightPlaneService.count());
        res.setData(ticketFlightPlanes);
        return res;
    }

    @RequestMapping(value = "add1",method = RequestMethod.POST)
    @ResponseBody
    public int add1(@RequestBody TicketFlightPlane record){
        return ticketFlightPlaneService.insert(record);
    }
}
