package com.abr.formationspring.core.entity;

import jakarta.persistence.*;

@Entity
public class Review {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    private String reviewComment;
    @Column(nullable = false)
    private Short mark;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Movie movie;
    @JoinColumn(name = "ID_REVIEWER")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private User reviwer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReviewComment() {
        return reviewComment;
    }

    public void setReviewComment(String reviewComment) {
        this.reviewComment = reviewComment;
    }

    public Short getMark() {
        return mark;
    }

    public void setMark(Short mark) {
        this.mark = mark;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getReviwer() {
        return reviwer;
    }

    public void setReviwer(User reviwer) {
        this.reviwer = reviwer;
    }
}
