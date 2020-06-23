package com.cn.test.entity;

import java.util.Date;

/**
 * @author Administrator
 */
public class TicketFlight {
    private Integer id;

    private String flightno;

    private Integer flightcompony;

    private Date starttime;

    private Date endtime;

    private String start;

    private String destination;

    private Integer plane;

    private Float price;

    private Integer capability;

    private Integer firstclass;

    private Integer businessclass;

    private Integer touristclass;

    private Date startdate;

    private Date enddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno == null ? null : flightno.trim();
    }

    public Integer getFlightcompony() {
        return flightcompony;
    }

    public void setFlightcompony(Integer flightcompony) {
        this.flightcompony = flightcompony;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination == null ? null : destination.trim();
    }

    public Integer getPlane() {
        return plane;
    }

    public void setPlane(Integer plane) {
        this.plane = plane;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getCapability() {
        return capability;
    }

    public void setCapability(Integer capability) {
        this.capability = capability;
    }

    public Integer getFirstclass() {
        return firstclass;
    }

    public void setFirstclass(Integer firstclass) {
        this.firstclass = firstclass;
    }

    public Integer getBusinessclass() {
        return businessclass;
    }

    public void setBusinessclass(Integer businessclass) {
        this.businessclass = businessclass;
    }

    public Integer getTouristclass() {
        return touristclass;
    }

    public void setTouristclass(Integer touristclass) {
        this.touristclass = touristclass;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "TicketFlight{" +
                "id=" + id +
                ", flightno='" + flightno + '\'' +
                ", flightcompony=" + flightcompony +
                ", starttime=" + starttime +
                ", endtime=" + endtime +
                ", start='" + start + '\'' +
                ", destination='" + destination + '\'' +
                ", plane=" + plane +
                ", price=" + price +
                ", capability=" + capability +
                ", firstclass=" + firstclass +
                ", businessclass=" + businessclass +
                ", touristclass=" + touristclass +
                ", startdate=" + startdate +
                ", enddate=" + enddate +
                '}';
    }
}
