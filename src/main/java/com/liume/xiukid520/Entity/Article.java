package com.liume.xiukid520.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Article {

    private Integer id;
    private String userName;
    private String content;
    private Date dateOfCreate;
    private Date lastUpdate;

    private Article() {

    }

    public Article(String userName, String content, Date dateOfCreate, Date lastUpdate) {
        this.userName = userName;
        this.content = content;
        this.dateOfCreate = dateOfCreate;
        this.lastUpdate = lastUpdate;
    }

    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDateOfCreate() {
        return dateOfCreate;
    }

    public void setDateOfCreate(Date dateOfCreate) {
        this.dateOfCreate = dateOfCreate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
