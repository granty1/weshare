package com.weshare.pojo;

public class WsUser {
    private Long uId;

    private String username;

    private String password;

    private Integer uIntegral;

    private String uOccu;

    private String uSex;

    private String uUpdate;

    private String uCreat;

    private String uPhone;

    private String uNickname;

    private String uSignature;

    private String uHead;

    private Integer uStatus;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getuIntegral() {
        return uIntegral;
    }

    public void setuIntegral(Integer uIntegral) {
        this.uIntegral = uIntegral;
    }

    public String getuOccu() {
        return uOccu;
    }

    public void setuOccu(String uOccu) {
        this.uOccu = uOccu == null ? null : uOccu.trim();
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex == null ? null : uSex.trim();
    }

    public String getuUpdate() {
        return uUpdate;
    }

    public void setuUpdate(String uUpdate) {
        this.uUpdate = uUpdate == null ? null : uUpdate.trim();
    }

    public String getuCreat() {
        return uCreat;
    }

    public void setuCreat(String uCreat) {
        this.uCreat = uCreat == null ? null : uCreat.trim();
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone == null ? null : uPhone.trim();
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname == null ? null : uNickname.trim();
    }

    public String getuSignature() {
        return uSignature;
    }

    public void setuSignature(String uSignature) {
        this.uSignature = uSignature == null ? null : uSignature.trim();
    }

    public String getuHead() {
        return uHead;
    }

    public void setuHead(String uHead) {
        this.uHead = uHead == null ? null : uHead.trim();
    }

    public Integer getuStatus() {
        return uStatus;
    }

    public void setuStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }
}