package com.cn.test.entity;

import java.util.Date;

/**
 * @author Administrator
 */
public class TicketFlightOrder {
    private Integer id;

    private Float price;

    private Integer tourist;

    private Integer flight;

    private String flightPayinfo;

    private Date orderdate;

    private String cabin;

    private Float cutoff;

    private Date orderdisposetime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getTourist() {
        return tourist;
    }

    public void setTourist(Integer tourist) {
        this.tourist = tourist;
    }

    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public String getFlightPayinfo() {
        return flightPayinfo;
    }

    public void setFlightPayinfo(String flightPayinfo) {
        this.flightPayinfo = flightPayinfo;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public String getCabin() {
        return cabin;
    }

    public void setCabin(String cabin) {
        this.cabin = cabin == null ? null : cabin.trim();
    }

    public Float getCutoff() {
        return cutoff;
    }

    public void setCutoff(Float cutoff) {
        this.cutoff = cutoff;
    }

    public Date getOrderdisposetime() {
        return orderdisposetime;
    }

    public void setOrderdisposetime(Date orderdisposetime) {
        this.orderdisposetime = orderdisposetime;
    }
}
