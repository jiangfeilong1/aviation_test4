package com.cn.test.controller;

import com.cn.test.entity.TicketFlightTourist;
import com.cn.test.service.TicketFlightTouristService;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketFlightTouristController {
    @Autowired
    private TicketFlightTouristService ticketFlightTouristService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete10")
    @ResponseBody
    public Return delete10(int id){
        int i = ticketFlightTouristService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "edit10",method = RequestMethod.POST)
    @ResponseBody
    public int edit10(@RequestBody TicketFlightTourist record){
        return ticketFlightTouristService.updateByPrimaryKey(record);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page10")
    @ResponseBody
    public Return page10(HttpServletRequest request){
        return getaReturn(request, ticketFlightTouristService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketFlightTouristService ticketFlightTouristService, Return res) {
        Pager<TicketFlightTourist> pager = new Pager<TicketFlightTourist>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketFlightTouristService.selectAll());
        TicketFlightTourist[] ticketFlightTourists = pager.getSmallList().toArray(new TicketFlightTourist[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightTouristService.count());
        res.setData(ticketFlightTourists);
        return res;
    }

    @RequestMapping(value = "add4",method = RequestMethod.POST)
    @ResponseBody
    public int add4(@RequestBody TicketFlightTourist record){
        record.toString();
        return ticketFlightTouristService.insert(record);
    }

    @RequestMapping(value = "tijiao",method = RequestMethod.POST)
    @ResponseBody
    public Return tiJiao(@RequestBody String jsonStr, HttpSession httpSession){
        JSONObject json = JSONObject.fromObject(jsonStr);
        //Integer id = Integer.parseInt(json.getString("id"));
        String name = json.getString("name");
        String type = json.getString("type");
        String nationality = json.getString("nationality");
        String gender = json.getString("gender");
        String identity = json.getString("identity");
        TicketFlightTourist ticketFlightTourist = new TicketFlightTourist();
        ticketFlightTourist.setName(name);
        ticketFlightTourist.setType(type);
        ticketFlightTourist.setGender(gender);
        ticketFlightTourist.setNationality(nationality);
        ticketFlightTourist.setIdentity(identity);
        ticketFlightTourist.setCertNo("0");
        ticketFlightTourist.setCertName("0");
        ticketFlightTourist.setInsurance("0");
        Integer id = ticketFlightTouristService.insert(ticketFlightTourist);
        ticketFlightTourist.setId(id);
        httpSession.setAttribute("ticketFlightTourist",ticketFlightTourist);
        res.setCode(0);
        return res;
    }
}
