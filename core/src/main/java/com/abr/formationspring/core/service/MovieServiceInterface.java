package com.abr.formationspring.core.service;

import com.abr.formationspring.core.entity.Movie;

import java.util.List;

public interface MovieServiceInterface {

    Movie registerMovie(Movie movie);
    List<Movie> list();
    Movie getMovieById(Long id);
}
