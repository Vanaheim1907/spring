package com.abr.formationspring.core.service;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.repository.MovieRepositoryInterface;

public class DefaultMovieService implements MovieServiceInterface{

    private MovieRepositoryInterface repository;

    public void registerMovie(Movie movie){

        repository.add(movie);

    }
}
