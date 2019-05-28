package com.weshare.pojo;

public class WsArticle {
    private Long aId;

    private String aName;

    private String aKind;

    private Long userId;

    private Integer aSeenum;

    private String aCtime;

    private String aText;

    public Long getaId() {
        return aId;
    }

    public void setaId(Long aId) {
        this.aId = aId;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName == null ? null : aName.trim();
    }

    public String getaKind() {
        return aKind;
    }

    public void setaKind(String aKind) {
        this.aKind = aKind == null ? null : aKind.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getaSeenum() {
        return aSeenum;
    }

    public void setaSeenum(Integer aSeenum) {
        this.aSeenum = aSeenum;
    }

    public String getaCtime() {
        return aCtime;
    }

    public void setaCtime(String aCtime) {
        this.aCtime = aCtime == null ? null : aCtime.trim();
    }

    public String getaText() {
        return aText;
    }

    public void setaText(String aText) {
        this.aText = aText == null ? null : aText.trim();
    }
}