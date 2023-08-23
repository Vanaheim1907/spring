package com.abr.formationspring.core.service;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    @Autowired
    private final MovieRepositoryInterface movieRepository;

    public DefaultMovieService(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public Movie registerMovie(Movie movie){

        movieRepository.save(movie);
        return movie;
    }

    @Override
    public Iterable<Movie> list() {
        return movieRepository.findAll();
    }

    @Override
    public Optional<Movie> getMovieById(Long id) {
        return Optional.of(movieRepository.findById(id).orElseThrow());
    }
}
