package com.liume.xiukid520.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ImageSource {
    private Integer id;
    private String imgIndex;
    private String url;

    private ImageSource() {
    }

    public ImageSource(Integer id, String type, String url) {
        this.id = id;
        this.imgIndex = type;
        this.url = url;

    }
    @Id
    @GeneratedValue
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImgIndex() {
        return imgIndex;
    }

    public void setImgIndex(String imgIndex) {
        this.imgIndex = imgIndex;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
