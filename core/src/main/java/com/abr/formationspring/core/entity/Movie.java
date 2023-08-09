package com.abr.formationspring.core.entity;

import java.util.List;

public class Movie {

    private String title;
    private String description;
    private String type;
    private String mainActor;
    private List<String> distribution;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
