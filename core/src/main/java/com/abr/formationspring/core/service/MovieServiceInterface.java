package com.abr.formationspring.core.service;

import com.abr.formationspring.core.entity.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieServiceInterface {

    Movie registerMovie(Movie movie);
    Iterable<Movie> list();
    Movie getMovieById(Long id);
}
