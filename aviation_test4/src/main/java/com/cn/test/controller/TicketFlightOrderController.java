package com.cn.test.controller;

import com.cn.test.entity.TicketFlight;
import com.cn.test.entity.TicketFlightOrder;
import com.cn.test.entity.TicketFlightTourist;
import com.cn.test.service.TicketFlightOrderService;
import com.cn.test.entity.ZhiFu;
import com.cn.test.service.ZhiFuService;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketFlightOrderController {
    @Autowired
    private TicketFlightOrderService ticketFlightOrderService;

    @Autowired
    private ZhiFuService zhiFuService;

    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete9")
    @ResponseBody
    public Return delete9(int id){
        int i = ticketFlightOrderService.deleteByPrimaryKey(id);
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
    @RequestMapping(value = "edit9",method = RequestMethod.POST)
    @ResponseBody
    public int edit9(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketFlightOrder ticketFlightOrder = new TicketFlightOrder();
        ticketFlightOrder.setId(Integer.parseInt(json.getString("id")));
        ticketFlightOrder.setCabin(json.getString("cabin"));
        ticketFlightOrder.setCutoff(Float.parseFloat(json.getString("cutoff")));
        ticketFlightOrder.setFlight(Integer.parseInt(json.getString("flight")));
        ticketFlightOrder.setFlightPayinfo(json.getString("flightPayinfo"));
        ticketFlightOrder.setPrice(Float.parseFloat(json.getString("price")));
        ticketFlightOrder.setOrderdisposetime(sdf.parse(json.getString("orderdisposetime")));
        ticketFlightOrder.setOrderdate(sdf.parse(json.getString("orderdate")));
        ticketFlightOrder.setTourist(Integer.parseInt(json.getString("tourist")));
        return ticketFlightOrderService.updateByPrimaryKey(ticketFlightOrder);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "page9")
    @ResponseBody
    public Return page9(HttpServletRequest request){
        return getaReturn(request, ticketFlightOrderService, res);
    }

    static Return getaReturn(HttpServletRequest request, TicketFlightOrderService ticketFlightOrderService, Return res) {
        Pager<TicketFlightOrder> pager = new Pager<TicketFlightOrder>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketFlightOrderService.selectAll());
        TicketFlightOrder[] ticketFlightOrders = pager.getSmallList().toArray(new TicketFlightOrder[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightOrderService.count());
        res.setData(ticketFlightOrders);
        return res;
    }

    @RequestMapping(value = "addFlightOrder",method = RequestMethod.POST)
    @ResponseBody
    public int addFlightOrder(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketFlightOrder ticketFlightOrder = new TicketFlightOrder();
        ticketFlightOrder.setCabin(json.getString("cabin"));
        ticketFlightOrder.setCutoff(Float.parseFloat(json.getString("cutoff")));
        ticketFlightOrder.setFlight(Integer.parseInt(json.getString("flight")));
        ticketFlightOrder.setFlightPayinfo(json.getString("flightPayinfo"));
        ticketFlightOrder.setPrice(Float.parseFloat(json.getString("price")));
        ticketFlightOrder.setOrderdisposetime(sdf.parse(json.getString("orderdisposetime")));
        ticketFlightOrder.setOrderdate(sdf.parse(json.getString("orderdate")));
        ticketFlightOrder.setTourist(Integer.parseInt(json.getString("tourist")));
        return ticketFlightOrderService.insert(ticketFlightOrder);
    }

    @RequestMapping(value = "addFlightOrder2")
    @ResponseBody
    public Return addFlightOrder2(HttpSession httpSession) {
        TicketFlightTourist ticketFlightTourist = (TicketFlightTourist) httpSession.getAttribute("ticketFlightTourist");
        TicketFlight ticketFlight = (TicketFlight) httpSession.getAttribute("ticketFlight");
        String username = (String) httpSession.getAttribute("username");
        TicketFlightOrder ticketFlightOrder = new TicketFlightOrder();
        ZhiFu zhiFu = new ZhiFu();
        res.setCode(0);
        ticketFlightOrder.setCabin(ticketFlightTourist.getType());
        //ticketFlightTourist.getType()
        ticketFlightOrder.setCutoff((float) 0.8);
        ticketFlightOrder.setFlight(ticketFlight.getId());
        ticketFlightOrder.setFlightPayinfo(username);
        ticketFlightOrder.setPrice(ticketFlight.getPrice());
        ticketFlightOrder.setOrderdisposetime(ticketFlight.getEnddate());
        ticketFlightOrder.setOrderdate(ticketFlight.getStartdate());
        ticketFlightOrder.setTourist(ticketFlightTourist.getId());
        ticketFlightOrderService.insert(ticketFlightOrder);
        Integer ticketFlightOrderId = ticketFlightOrderService.selectID();
        zhiFu.setOrderid(ticketFlightOrderId);
        zhiFu.setUsername(username);
        zhiFu.setZhuangtai("已生成");
        zhiFuService.insert(zhiFu);
        httpSession.setAttribute("zhiFu",zhiFu);
        httpSession.setAttribute("ticketFlightOrderId",ticketFlightOrderId);
        return res;
    }

    @RequestMapping(value = "selectFlightOrder")
    @ResponseBody
    public Return selectFlightOrder(HttpSession httpSession) {
        String username = (String) httpSession.getAttribute("username");
        ZhiFu[] zhiFus = zhiFuService.selectByUsername(username);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(zhiFus.length);
        res.setData(zhiFus);
        return res;
    }

    @RequestMapping(value = "zhiFuFlightOrder")
    @ResponseBody
    public Return zhiFuFlightOrder(HttpSession httpSession) {
        Integer id = (Integer) httpSession.getAttribute("ticketFlightOrderId");
        TicketFlightOrder ticketFlightOrders = ticketFlightOrderService.selectByPrimaryKey(id);
        TicketFlightOrder[] ticketFlightOrders1 = new TicketFlightOrder[1];
        ticketFlightOrders1[0] = ticketFlightOrders;
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(1);
        res.setData(ticketFlightOrders1);
        return res;
    }
}
