package com.pangu.po;

public class TAnswer {
    private Long idIndex;

    private Long proId;

    private String answerContent;

    private String answerNo;

    private Integer isRight;

    public Long getIdIndex() {
        return idIndex;
    }

    public void setIdIndex(Long idIndex) {
        this.idIndex = idIndex;
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent == null ? null : answerContent.trim();
    }

    public String getAnswerNo() {
        return answerNo;
    }

    public void setAnswerNo(String answerNo) {
        this.answerNo = answerNo == null ? null : answerNo.trim();
    }

    public Integer getIsRight() {
        return isRight;
    }

    public void setIsRight(Integer isRight) {
        this.isRight = isRight;
    }
}