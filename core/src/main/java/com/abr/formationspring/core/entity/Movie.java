package com.abr.formationspring.core.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {

    @Column(nullable = false, length = 20)
    private String title;
    private String description;
    @Column(name = "genre", nullable = false, length = 20)
    private String type;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "ID_MAIN_ACTOR")
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Actor mainActor;

    @ManyToMany
    @JoinTable(name = "MOVIE_SEC_ACTORS", joinColumns = {@JoinColumn(name = "ID_MOVIE")}, inverseJoinColumns = {@JoinColumn(name = "ID_ACTOR")})
    private List<Actor> secondaryActors = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, orphanRemoval = true, mappedBy = "movie")
    private List<Review> reviewList = new ArrayList<>();

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

    public Actor getMainActor() {
        return mainActor;
    }

    public void setMainActor(Actor mainActor) {
        this.mainActor = mainActor;
    }

    public List<Actor> getSecondaryActors() {
        return secondaryActors;
    }

    public void setSecondaryActors(List<Actor> secondaryActors) {
        this.secondaryActors = secondaryActors;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void setReviewList(List<Review> reviewList) {
        this.reviewList = reviewList;
    }
}
