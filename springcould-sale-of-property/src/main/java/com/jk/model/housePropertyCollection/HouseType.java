package com.jk.model.housePropertyCollection;

import java.io.Serializable;

public class HouseType implements Serializable {
    private String id;

    private String housertypename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getHousertypename() {
        return housertypename;
    }

    public void setHousertypename(String housertypename) {
        this.housertypename = housertypename;
    }
}