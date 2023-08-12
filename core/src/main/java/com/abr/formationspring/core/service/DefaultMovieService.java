package com.abr.formationspring.core.service;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    private final MovieRepositoryInterface movieRepository;

    public DefaultMovieService(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public Movie registerMovie(Movie movie){

        movieRepository.add(movie);
        return movie;
    }

    @Override
    public List<Movie> list() {
        return movieRepository.list();
    }

    @Override
    public Movie getMovieById(Long id) {
        return movieRepository.getById(id);
    }
}
