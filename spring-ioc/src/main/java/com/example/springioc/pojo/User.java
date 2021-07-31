package com.example.springioc.pojo;


public class User {
    private Integer userId;
    private String userName;
    private String idCard;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public User(Integer userId, String userName, String idCard) {
        this.userId = userId;
        this.userName = userName;
        this.idCard = idCard;
        System.out.println("UserID:"+userId+"Name:"+userName+"身份证:"+idCard);
    }
}
