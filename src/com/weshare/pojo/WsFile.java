package com.weshare.pojo;

public class WsFile {
    private Long fId;

    private Long uId;

    private String fName;

    private String fTitle;

    private Double fSize;

    private String fDesc;

    private Integer fIntegral;

    private String fCreat;

    private String fKind;

    private String fPath;

    private Integer fStatus;

    private Long fDownnum;

    public Long getfId() {
        return fId;
    }

    public void setfId(Long fId) {
        this.fId = fId;
    }

    public Long getuId() {
        return uId;
    }

    public void setuId(Long uId) {
        this.uId = uId;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName == null ? null : fName.trim();
    }

    public String getfTitle() {
        return fTitle;
    }

    public void setfTitle(String fTitle) {
        this.fTitle = fTitle == null ? null : fTitle.trim();
    }

    public Double getfSize() {
        return fSize;
    }

    public void setfSize(Double fSize) {
        this.fSize = fSize;
    }

    public String getfDesc() {
        return fDesc;
    }

    public void setfDesc(String fDesc) {
        this.fDesc = fDesc == null ? null : fDesc.trim();
    }

    public Integer getfIntegral() {
        return fIntegral;
    }

    public void setfIntegral(Integer fIntegral) {
        this.fIntegral = fIntegral;
    }

    public String getfCreat() {
        return fCreat;
    }

    public void setfCreat(String fCreat) {
        this.fCreat = fCreat == null ? null : fCreat.trim();
    }

    public String getfKind() {
        return fKind;
    }

    public void setfKind(String fKind) {
        this.fKind = fKind == null ? null : fKind.trim();
    }

    public String getfPath() {
        return fPath;
    }

    public void setfPath(String fPath) {
        this.fPath = fPath == null ? null : fPath.trim();
    }

    public Integer getfStatus() {
        return fStatus;
    }

    public void setfStatus(Integer fStatus) {
        this.fStatus = fStatus;
    }

    public Long getfDownnum() {
        return fDownnum;
    }

    public void setfDownnum(Long fDownnum) {
        this.fDownnum = fDownnum;
    }
}