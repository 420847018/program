package com.pangu.po;

public class TProblem {
    private Long idIndex;

    private String problemContent;

    private Byte problemType;

    private String problemNo;

    private Long pageId;

    public Long getIdIndex() {
        return idIndex;
    }

    public void setIdIndex(Long idIndex) {
        this.idIndex = idIndex;
    }

    public String getProblemContent() {
        return problemContent;
    }

    public void setProblemContent(String problemContent) {
        this.problemContent = problemContent == null ? null : problemContent.trim();
    }

    public Byte getProblemType() {
        return problemType;
    }

    public void setProblemType(Byte problemType) {
        this.problemType = problemType;
    }

    public String getProblemNo() {
        return problemNo;
    }

    public void setProblemNo(String problemNo) {
        this.problemNo = problemNo == null ? null : problemNo.trim();
    }

    public Long getPageId() {
        return pageId;
    }

    public void setPageId(Long pageId) {
        this.pageId = pageId;
    }
}