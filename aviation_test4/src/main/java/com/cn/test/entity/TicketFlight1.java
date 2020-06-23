package com.cn.test.entity;

import java.util.Date;

public class TicketFlight1 {

    private String flightno;

    private String flightcompony;

    private Date starttime;

    private Date endtime;

    private String start;

    private String destination;

    private String plane;

    private Float price;

    private Integer capability;

    private Date startdate;

    private Date enddate;

    public TicketFlight1() {
    }

    public String getFlightno() {
        return flightno;
    }

    public TicketFlight1 setFlightno(String flightno) {
        this.flightno = flightno;
        return this;
    }

    public String getFlightcompony() {
        return flightcompony;
    }

    public TicketFlight1 setFlightcompony(String flightcompony) {
        this.flightcompony = flightcompony;
        return this;
    }

    public Date getStarttime() {
        return starttime;
    }

    public TicketFlight1 setStarttime(Date starttime) {
        this.starttime = starttime;
        return this;
    }

    public Date getEndtime() {
        return endtime;
    }

    public TicketFlight1 setEndtime(Date endtime) {
        this.endtime = endtime;
        return this;
    }

    public String getStart() {
        return start;
    }

    public TicketFlight1 setStart(String start) {
        this.start = start;
        return this;
    }

    public String getDestination() {
        return destination;
    }

    public TicketFlight1 setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public String getPlane() {
        return plane;
    }

    public TicketFlight1 setPlane(String plane) {
        this.plane = plane;
        return this;
    }

    public Float getPrice() {
        return price;
    }

    public TicketFlight1 setPrice(Float price) {
        this.price = price;
        return this;
    }

    public Integer getCapability() {
        return capability;
    }

    public TicketFlight1 setCapability(Integer capability) {
        this.capability = capability;
        return this;
    }

    public Date getStartdate() {
        return startdate;
    }

    public TicketFlight1 setStartdate(Date startdate) {
        this.startdate = startdate;
        return this;
    }

    public Date getEnddate() {
        return enddate;
    }

    public TicketFlight1 setEnddate(Date enddate) {
        this.enddate = enddate;
        return this;
    }
}
