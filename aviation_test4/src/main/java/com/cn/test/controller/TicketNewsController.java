package com.cn.test.controller;

import com.cn.test.entity.TicketNews;
import com.cn.test.service.TicketNewsService;
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
public class TicketNewsController {
    @Autowired
    private TicketNewsService ticketNewsService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete7")
    @ResponseBody
    public Return delete7(int id){
        int i = ticketNewsService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "edit7",method = RequestMethod.POST)
    @ResponseBody
    public int edit7(@RequestBody TicketNews record){
        return ticketNewsService.updateByPrimaryKey(record);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page7")
    @ResponseBody
    public Return page7(HttpServletRequest request){
        return getaReturn(request, ticketNewsService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketNewsService ticketNewsService, Return res) {
        Pager<TicketNews> pager = new Pager<TicketNews>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketNewsService.selectAll());
        TicketNews[] ticketNews = pager.getSmallList().toArray(new TicketNews[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketNewsService.count());
        res.setData(ticketNews);
        return res;
    }

    @RequestMapping(value = "addTicketNews",method = RequestMethod.POST)
    @ResponseBody
    public Return addTicketNews(@RequestBody TicketNews record){
        ticketNewsService.insert(record);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketNewsService.count());
        return res;
    }
}
