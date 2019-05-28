package com.weshare.pojo;

public class WsWebcount {
    private String datatime;

    private Long clicks;

    private Long registernums;

    public String getDatatime() {
        return datatime;
    }

    public void setDatatime(String datatime) {
        this.datatime = datatime == null ? null : datatime.trim();
    }

    public Long getClicks() {
        return clicks;
    }

    public void setClicks(Long clicks) {
        this.clicks = clicks;
    }

    public Long getRegisternums() {
        return registernums;
    }

    public void setRegisternums(Long registernums) {
        this.registernums = registernums;
    }
}