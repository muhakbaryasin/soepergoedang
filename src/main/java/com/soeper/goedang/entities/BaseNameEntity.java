package com.soeper.goedang.entities;

import javax.persistence.Column;

public class BaseNameEntity extends BaseEntity {
    @Column(name = "name", length = 32)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
