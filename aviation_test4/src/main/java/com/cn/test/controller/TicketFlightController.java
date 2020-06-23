package com.cn.test.controller;

import net.sf.json.JSONObject;
import com.cn.test.entity.*;
import com.cn.test.service.*;
import com.cn.test.util.Pager;
import com.cn.test.util.Return;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author Administrator
 */
@Controller
@RequestMapping(value = "test")
public class TicketFlightController {
    @Autowired
    private TicketFlightService ticketFlightService;

    @Autowired
    private TicketFlightPlaneService ticketFlightPlaneService;

    @Autowired
    private TicketFlightCompanyService ticketFlightCompanyService;


    Return res = new Return();

    /**
     *航空公司按主键删除
     * @param id
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */
    @RequestMapping(value = "delete2")
    @ResponseBody
    public Return delete2(int id){
        int i = ticketFlightService.deleteByPrimaryKey(id);
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
     * @RequestParam("id") Integer id, @RequestParam("flightno") String flightno, @RequestParam("flightcompony") Integer flightcompony,
     *                      @RequestParam("starttime") Date starttime, @RequestParam("endtime") Date endtime, @RequestParam("start") String start,
     *                      @RequestParam("destination") String destination,@RequestParam("plane") Integer plane ,@RequestParam("price") Float price,
     *                      @RequestParam("capability") Integer capability,@RequestParam("firstclass") Integer firstclass,@RequestParam("businessclass") Integer businessclass,
     *                      @RequestParam("touristclass") Integer touristclass,@RequestParam("startdate") Date startdate,@RequestParam("enddate") Date enddate
     */
    @RequestMapping(value = "edit2",method = RequestMethod.POST)
    @ResponseBody
    public int edit2(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketFlight ticketFlight = new TicketFlight();
        ticketFlight.setId(Integer.parseInt(json.getString("id")));
        ticketFlight.setFlightcompony(Integer.parseInt(json.getString("flightcompony")));
        ticketFlight.setFlightno(json.getString("flightno"));
        ticketFlight.setStarttime(sdf1.parse(json.getString("starttime")));
        ticketFlight.setEndtime(sdf1.parse(json.getString("endtime")));
        ticketFlight.setStart(json.getString("start"));
        ticketFlight.setDestination(json.getString("destination"));
        ticketFlight.setPlane(Integer.parseInt(json.getString("plane")));
        ticketFlight.setPrice(Float.parseFloat(json.getString("price")));
        ticketFlight.setCapability(Integer.parseInt(json.getString("capability")));
        ticketFlight.setFirstclass(Integer.parseInt(json.getString("firstclass")));
        ticketFlight.setBusinessclass(Integer.parseInt(json.getString("businessclass")));
        ticketFlight.setTouristclass(Integer.parseInt(json.getString("touristclass")));
        ticketFlight.setStartdate(sdf.parse(json.getString("startdate")));
        ticketFlight.setEnddate(sdf.parse(json.getString("enddate")));
        return ticketFlightService.updateByPrimaryKey(ticketFlight);
    }

    /**
     *航空公司分页列表  查询的数据
     * @return 全部数据 格式见Return类
     * component\tabs\index.html
     */

    @RequestMapping(value = "page2")
    @ResponseBody
    public Return getaReturn(HttpServletRequest request) {
        Pager<TicketFlight> pager = new Pager<TicketFlight>();
        pager.setCurentPageIndex(Integer.parseInt(request.getParameter("page")));
        pager.setCountPerpage(Integer.parseInt(request.getParameter("limit")));
        pager.setBigList(ticketFlightService.selectAll());
        TicketFlight[] ticketFlights = pager.getSmallList().toArray(new TicketFlight[0]);
        TicketFlight1[] ticketFlight1s = new TicketFlight1[ticketFlights.length];
        for (int i = 0; i < ticketFlights.length; i++){
            TicketFlight ticketFlight = ticketFlights[i];
            TicketFlight1 ticketFlight1 = new TicketFlight1();
            ticketFlight1.setCapability(ticketFlight.getCapability());
            ticketFlight1.setDestination(ticketFlight.getDestination());
            ticketFlight1.setEnddate(ticketFlight.getEnddate());
            ticketFlight1.setEndtime(ticketFlight.getEndtime());
            ticketFlight1.setFlightno(ticketFlight.getFlightno());
            ticketFlight1.setStart(ticketFlight.getStart());
            ticketFlight1.setPrice(ticketFlight.getPrice());
            ticketFlight1.setStartdate(ticketFlight.getStartdate());
            ticketFlight1.setStarttime(ticketFlight.getStarttime());
            Integer a = ticketFlight.getFlightcompony();
            Integer b = ticketFlight.getPlane();
            TicketFlightCompany ticketFlightCompany = ticketFlightCompanyService.selectByPrimaryKey(a);
            TicketFlightPlane ticketFlightPlane = ticketFlightPlaneService.selectByPrimaryKey(b);
            ticketFlight1.setFlightcompony(ticketFlightCompany.getName());
            ticketFlight1.setPlane(ticketFlightPlane.getName());
            ticketFlight1s[i] = ticketFlight1;
        }
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlightService.count());
        res.setData(ticketFlight1s);
        return res;
    }

    @RequestMapping(value = "addFlight",method = RequestMethod.POST)
    @ResponseBody
    public int addFlight(@RequestBody String jsonStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketFlight ticketFlight = new TicketFlight();
        ticketFlight.setFlightcompony(Integer.parseInt(json.getString("flightcompony")));
        ticketFlight.setFlightno(json.getString("flightno"));
        ticketFlight.setStarttime(sdf1.parse(json.getString("starttime")));
        ticketFlight.setEndtime(sdf1.parse(json.getString("endtime")));
        ticketFlight.setStart(json.getString("start"));
        ticketFlight.setDestination(json.getString("destination"));
        ticketFlight.setPlane(Integer.parseInt(json.getString("plane")));
        ticketFlight.setPrice(Float.parseFloat(json.getString("price")));
        ticketFlight.setCapability(Integer.parseInt(json.getString("capability")));
        ticketFlight.setFirstclass(Integer.parseInt(json.getString("firstclass")));
        ticketFlight.setBusinessclass(Integer.parseInt(json.getString("businessclass")));
        ticketFlight.setTouristclass(Integer.parseInt(json.getString("touristclass")));
        ticketFlight.setStartdate(sdf.parse(json.getString("startdate")));
        ticketFlight.setEnddate(sdf.parse(json.getString("enddate")));
        return ticketFlightService.insert(ticketFlight);
    }

    @RequestMapping(value = "addSessionFlight1",method = RequestMethod.POST)
    @ResponseBody
    public Return addSessionFlight1(@RequestBody String jsonStr,HttpSession httpSession) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat sdf1 = new SimpleDateFormat("HH:mm");
        JSONObject json = JSONObject.fromObject(jsonStr);
        TicketFlight1 ticketFlight1 = new TicketFlight1();
        ticketFlight1.setFlightcompony(json.getString("flightcompony"));
        ticketFlight1.setFlightno(json.getString("flightno"));
        ticketFlight1.setStarttime(sdf1.parse(json.getString("starttime")));
        ticketFlight1.setEndtime(sdf1.parse(json.getString("endtime")));
        ticketFlight1.setStart(json.getString("start"));
        ticketFlight1.setDestination(json.getString("destination"));
        ticketFlight1.setPlane(json.getString("plane"));
        ticketFlight1.setPrice(Float.parseFloat(json.getString("price")));
        ticketFlight1.setCapability(Integer.parseInt(json.getString("capability")));
        ticketFlight1.setStartdate(sdf.parse(json.getString("startdate")));
        ticketFlight1.setEnddate(sdf.parse(json.getString("enddate")));
        httpSession.setAttribute("ticketFlight1",ticketFlight1);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(0);
        res.setData(null);
        return res;
    }

    @PostMapping(value = "selectFlight")
    @ResponseBody
    public Return seclect(@RequestParam(value="start") String start,
                          @RequestParam(value="destination") String destination,
                          @RequestParam(value="enddate") String enddate,
                          @RequestParam(value="startdate") String startdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startdate1 = sdf.parse(startdate);
        Date enddate1 = sdf.parse(enddate);
        TicketFlight[] ticketFlights = ticketFlightService.selectByDate(startdate1,enddate1,start,destination).toArray(new TicketFlight[0]);
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(ticketFlights.length);
        res.setData(ticketFlights);
        return res;
    }

    @PostMapping(value = "selectFlight1")
    @ResponseBody
    public Return seclectId(@RequestBody String jsonStr, HttpSession httpSession) {
        JSONObject json = JSONObject.fromObject(jsonStr);
        Integer id = Integer.parseInt(json.getString("id"));
        TicketFlight ticketFlight = ticketFlightService.selectByPrimaryKey(id);
        Float price = ticketFlight.getPrice();
        httpSession.setAttribute("price",price);
        httpSession.setAttribute("ticketFlight",ticketFlight);
        httpSession.setAttribute("idFlight",id);
        res.setCode(0);
        return res;
    }

    @RequestMapping(value = "sessionFlight")
    @ResponseBody
    public Return sessionFlight(HttpSession httpSession) {
        Integer id = (Integer) httpSession.getAttribute("idFlight");
        TicketFlight ticketFlight = ticketFlightService.selectByPrimaryKey(id);
        TicketFlightTourist ticketFlightTourist = (TicketFlightTourist) httpSession.getAttribute("ticketFlightTourist");
        String name = ticketFlightTourist.getName();
        String identity = ticketFlightTourist.getIdentity();
        Dingdan[] dingdans = new Dingdan[1];
        Dingdan dingdan = new Dingdan();
        dingdan.setId(ticketFlight.getId());
        dingdan.setEnddate(ticketFlight.getEnddate());
        dingdan.setDestination(ticketFlight.getDestination());
        dingdan.setEndtime(ticketFlight.getEndtime());
        dingdan.setStart(ticketFlight.getStart());
        dingdan.setStarttime(ticketFlight.getStarttime());
        dingdan.setStartdate(ticketFlight.getStartdate());
        dingdan.setPrice(ticketFlight.getPrice());
        dingdan.setFlightno(ticketFlight.getFlightno());
        dingdan.setName(name);
        dingdan.setIdentity(identity);
        dingdans[0] = dingdan;
        res.setMsg("成功了");
        res.setTotal(1);
        res.setCode(0);
        res.setData(dingdans);
        return res;
    }

    @RequestMapping(value = "addSessionFlight2")
    @ResponseBody
    public Return addSessionFlight2(HttpSession httpSession) throws ParseException {
        TicketFlight1 ticketFlight1 = (TicketFlight1) httpSession.getAttribute("ticketFlight1");
        TicketFlight1[] ticketFlight1s = new TicketFlight1[1];
        ticketFlight1s[0] = ticketFlight1;
        res.setCode(0);
        res.setMsg("成功了");
        res.setTotal(1);
        res.setData(ticketFlight1s);
        return res;
    }
}
