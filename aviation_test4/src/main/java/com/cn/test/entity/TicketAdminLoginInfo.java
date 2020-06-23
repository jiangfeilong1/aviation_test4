package com.cn.test.entity;

import java.util.Date;

/**
 * @author Administrator
 */
public class TicketAdminLoginInfo {
    private Integer id;

    private String loginip;

    private Date logintime;

    private Date logofftime;

    private String user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginip() {
        return loginip;
    }

    public void setLoginip(String loginip) {
        this.loginip = loginip == null ? null : loginip.trim();
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public Date getLogofftime() {
        return logofftime;
    }

    public void setLogofftime(Date logofftime) {
        this.logofftime = logofftime;
    }

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "TicketAdminLoginInfo{" +
                "id=" + id +
                ", loginip='" + loginip + '\'' +
                ", logintime=" + logintime +
                ", logofftime=" + logofftime +
                ", user='" + user + '\'' +
                '}';
    }

    public TicketAdminLoginInfo(String loginip, Date logintime, Date logofftime, String user) {
        this.loginip = loginip;
        this.logintime = logintime;
        this.logofftime = logofftime;
        this.user = user;
    }

    public TicketAdminLoginInfo(Integer id, String loginip, Date logintime, Date logofftime, String user) {
        this.id = id;
        this.loginip = loginip;
        this.logintime = logintime;
        this.logofftime = logofftime;
        this.user = user;
    }

    public TicketAdminLoginInfo() {
    }

    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }
}
