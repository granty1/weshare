package com.weshare.pojo;

public class WsFrozen {
    private Long uId;

    private String fCause;

    private String fCtime;

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getfCause() {
        return fCause;
    }

    public void setfCause(String fCause) {
        this.fCause = fCause == null ? null : fCause.trim();
    }

    public String getfCtime() {
        return fCtime;
    }

    public void setfCtime(String fCtime) {
        this.fCtime = fCtime == null ? null : fCtime.trim();
    }
}