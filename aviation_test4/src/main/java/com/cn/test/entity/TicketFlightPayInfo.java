package com.cn.test.entity;

/**
 * @author Administrator
 */
public class TicketFlightPayInfo {
    private Integer id;

    private String payername;

    private String payerphone;

    private String payeremail;

    private String payeraddress;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPayername() {
        return payername;
    }

    public void setPayername(String payername) {
        this.payername = payername == null ? null : payername.trim();
    }

    public String getPayerphone() {
        return payerphone;
    }

    public void setPayerphone(String payerphone) {
        this.payerphone = payerphone == null ? null : payerphone.trim();
    }

    public String getPayeremail() {
        return payeremail;
    }

    public void setPayeremail(String payeremail) {
        this.payeremail = payeremail == null ? null : payeremail.trim();
    }

    public String getPayeraddress() {
        return payeraddress;
    }

    public void setPayeraddress(String payeraddress) {
        this.payeraddress = payeraddress == null ? null : payeraddress.trim();
    }
}
