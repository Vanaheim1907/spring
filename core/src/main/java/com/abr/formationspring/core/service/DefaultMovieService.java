package com.abr.formationspring.core.service;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.repository.MovieRepositoryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class DefaultMovieService implements MovieServiceInterface {

    private final MovieRepositoryInterface movieRepository;

    public DefaultMovieService(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieRepositoryInterface getMovieRepository() {
        return movieRepository;
    }

    public Movie registerMovie(Movie movie) {

        movieRepository.save(movie);
        return movie;
    }

    @Override
    public Iterable<Movie> list() {
        return movieRepository.findAll();
    }

    @Override
    public Movie getMovieById(Long id) {

        Optional<Movie> optionalMovie = movieRepository.findById(id);
        if (optionalMovie.isEmpty()) {
            throw new NoSuchElementException();
        }
        Movie movie = optionalMovie.get();
        //Initialize proxys
        movie.getMainActor().getFirstName();
        movie.getReviews().forEach(review -> {
            review.getMark();
            review.setMovie(null);
        });

        return movie;
    }
}
