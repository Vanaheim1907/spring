package com.abr.formationspring.core.entity;

import org.springframework.data.annotation.Id;

import java.util.List;

public class Movie {

    private String title;
    private String description;
    private String type;
    @Id
    private Long id;

    public Movie() {
    }

    public Movie(Long id, String title, String type) {
        this.title = title;
        this.type = type;
        this.id = id;
    }

    public Movie(Long id, String title, String type, String description) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
