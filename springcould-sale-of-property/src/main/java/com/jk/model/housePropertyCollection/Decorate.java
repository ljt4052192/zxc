package com.jk.model.housePropertyCollection;

import java.io.Serializable;

public class Decorate implements Serializable {
    private String id;

    private String decoratename;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getDecoratename() {
        return decoratename;
    }

    public void setDecoratename(String decoratename) {
        this.decoratename = decoratename;
    }
}