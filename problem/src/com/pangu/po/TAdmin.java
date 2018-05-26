package com.pangu.po;

public class TAdmin {
    private Long idIndex;

    private String userName;

    private String passWord;

    private String nickName;

    public Long getIdIndex() {
        return idIndex;
    }

    public void setIdIndex(Long idIndex) {
        this.idIndex = idIndex;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }
}