package com.cn.test.entity;

import java.util.Date;

/**
 * @author Administrator
 */
public class TicketFlightInfo {
    private Integer id;

    private Date date;

    private Integer flight;

    private Float cutoff;

    private Integer firstclass;

    private Integer bussinessclass;

    private Integer touristclass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getFlight() {
        return flight;
    }

    public void setFlight(Integer flight) {
        this.flight = flight;
    }

    public Float getCutoff() {
        return cutoff;
    }

    public void setCutoff(Float cutoff) {
        this.cutoff = cutoff;
    }

    public Integer getFirstclass() {
        return firstclass;
    }

    public void setFirstclass(Integer firstclass) {
        this.firstclass = firstclass;
    }

    public Integer getBussinessclass() {
        return bussinessclass;
    }

    public void setBussinessclass(Integer bussinessclass) {
        this.bussinessclass = bussinessclass;
    }

    public Integer getTouristclass() {
        return touristclass;
    }

    public void setTouristclass(Integer touristclass) {
        this.touristclass = touristclass;
    }
}
