package com.cn.test.entity;

/**
 * @author Administrator
 */
public class TicketFlightConfig {
    private Integer id;

    private Float kiddiscount;

    private Float infantdiscount;

    private Integer aerodromefee;

    private Integer oilfee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getKiddiscount() {
        return kiddiscount;
    }

    public void setKiddiscount(Float kiddiscount) {
        this.kiddiscount = kiddiscount;
    }

    public Float getInfantdiscount() {
        return infantdiscount;
    }

    public void setInfantdiscount(Float infantdiscount) {
        this.infantdiscount = infantdiscount;
    }

    public Integer getAerodromefee() {
        return aerodromefee;
    }

    public void setAerodromefee(Integer aerodromefee) {
        this.aerodromefee = aerodromefee;
    }

    public Integer getOilfee() {
        return oilfee;
    }

    public void setOilfee(Integer oilfee) {
        this.oilfee = oilfee;
    }
}
