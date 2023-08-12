package com.abr.formationspring.core.repository;

import com.abr.formationspring.core.entity.Movie;

import java.util.List;

public interface MovieRepositoryInterface {

    Movie add(Movie movie);
    List<Movie> list();
    Movie getById(Long id);


}
