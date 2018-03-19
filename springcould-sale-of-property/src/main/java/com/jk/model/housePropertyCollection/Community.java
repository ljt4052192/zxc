package com.jk.model.housePropertyCollection;

import java.io.Serializable;

public class Community  implements Serializable {
    private String id;

    private Long taid;

    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Long getTaid() {
        return taid;
    }

    public void setTaid(Long taid) {
        this.taid = taid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}