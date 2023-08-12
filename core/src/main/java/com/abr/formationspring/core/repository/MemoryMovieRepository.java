package com.abr.formationspring.core.repository;

import com.abr.formationspring.core.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private static final List<Movie> movieList = new ArrayList<>();
    public static long lastId=0L;

    public Movie add(Movie movie) {
        movie.setId(++lastId);
        movieList.add(movie);
        System.out.println("Movie " + movie.getTitle() + " has been added");

        return movie;
    }

    @Override
    public List<Movie> list() {
        return movieList;
    }

    @Override
    public Movie getById(Long id) {
        return movieList.stream().
                filter(m -> m.getId() == id).
                findFirst().get();
    }
}
