package com.jk.model.test;

import java.io.Serializable;

public class TreeMenu implements Serializable {

    private Integer id;

    private Integer tree_id;

    private String name;

    private String url;

    private String remark;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTree_id() {
        return tree_id;
    }

    public void setTree_id(Integer tree_id) {
        this.tree_id = tree_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "TreeMenu{" +
                "id=" + id +
                ", tree_id=" + tree_id +
                ", name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
