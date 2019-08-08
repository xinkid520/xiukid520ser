package com.liume.xiukid520.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class LeaveMessage {

    private Integer id;
    private String name;
    private String userInfo;
    private String msg;
    private String email;

    private LeaveMessage() {
    }

    public LeaveMessage(String name, String userInfo, String msg, String email) {
        this.name = name;
        this.userInfo = userInfo;
        this.msg = msg;
        this.email = email;
    }


    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}