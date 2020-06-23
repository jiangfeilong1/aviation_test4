package com.cn.test.controller;

import com.cn.test.entity.TicketAdminLoginInfo;
import com.cn.test.service.TicketAdminLoginInfoService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketAdminLoginInfoController {
    @Autowired
    private TicketAdminLoginInfoService ticketAdminLoginInfoService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete13")
    @ResponseBody
    public Return delete13(int id){
        int i = ticketAdminLoginInfoService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "edit13",method = RequestMethod.POST)
    @ResponseBody
    public int edit13(@RequestBody TicketAdminLoginInfo record){
        return ticketAdminLoginInfoService.updateByPrimaryKey(record);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page13")
    @ResponseBody
    public Return page13(HttpServletRequest request){
        return getaReturn(request, ticketAdminLoginInfoService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketAdminLoginInfoService ticketAdminLoginInfoService, Return res) {
        Pager<TicketAdminLoginInfo> pager = new Pager<TicketAdminLoginInfo>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketAdminLoginInfoService.selectAll());
        TicketAdminLoginInfo[] ticketNews = pager.getSmallList().toArray(new TicketAdminLoginInfo[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketAdminLoginInfoService.count());
        res.setData(ticketNews);
        return res;
    }
}
