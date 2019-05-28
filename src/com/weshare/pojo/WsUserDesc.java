package com.weshare.pojo;

public class WsUserDesc {
    private Long uId;

    private String uBith;

    private String uAddress;

    private String uEmail;

    private Long uQqnum;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getuBith() {
        return uBith;
    }

    public void setuBith(String uBith) {
        this.uBith = uBith == null ? null : uBith.trim();
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail == null ? null : uEmail.trim();
    }

    public Long getuQqnum() {
        return uQqnum;
    }

    public void setuQqnum(Long uQqnum) {
        this.uQqnum = uQqnum;
    }
}