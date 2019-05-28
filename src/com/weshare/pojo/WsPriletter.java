package com.weshare.pojo;

public class WsPriletter {
    private Long pId;

    private Long pAddre;

    private Long pReci;

    private String pTitle;

    private String pText;

    private String pCreat;

    private String pStatus;

    private String pType;

    public Long getpId() {
        return pId;
    }

    public void setpId(Long pId) {
        this.pId = pId;
    }

    public Long getpAddre() {
        return pAddre;
    }

    public void setpAddre(Long pAddre) {
        this.pAddre = pAddre;
    }

    public Long getpReci() {
        return pReci;
    }

    public void setpReci(Long pReci) {
        this.pReci = pReci;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle == null ? null : pTitle.trim();
    }

    public String getpText() {
        return pText;
    }

    public void setpText(String pText) {
        this.pText = pText == null ? null : pText.trim();
    }

    public String getpCreat() {
        return pCreat;
    }

    public void setpCreat(String pCreat) {
        this.pCreat = pCreat == null ? null : pCreat.trim();
    }

    public String getpStatus() {
        return pStatus;
    }

    public void setpStatus(String pStatus) {
        this.pStatus = pStatus == null ? null : pStatus.trim();
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType == null ? null : pType.trim();
    }

	@Override
	public String toString() {
		return "WsPriletter [pId=" + pId + ", pAddre=" + pAddre + ", pReci=" + pReci + ", pTitle=" + pTitle + ", pText="
				+ pText + ", pCreat=" + pCreat + ", pStatus=" + pStatus + ", pType=" + pType + "]";
	}
    
}