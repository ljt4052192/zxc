package com.jk.model.test;

import java.io.Serializable;

public class Dept  implements Serializable {

    public Integer id;

    public String text;

    public String selected;

    public Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", selected='" + selected + '\'' +
                ", pid=" + pid +
                '}';
    }
}
