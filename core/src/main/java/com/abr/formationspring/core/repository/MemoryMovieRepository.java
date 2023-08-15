package com.abr.formationspring.core.repository;

import com.abr.formationspring.core.entity.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class MemoryMovieRepository implements MovieRepositoryInterface {

    private static final List<Movie> movieList = new ArrayList<>();
    public static long lastId=0L;

    public Movie save(Movie movie) {
        movie.setId(++lastId);
        movieList.add(movie);
        System.out.println("Movie " + movie.getTitle() + " has been added");

        return movie;
    }

    @Override
    public List<Movie> findAll() {
        return movieList;
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return movieList.stream().
                filter(m -> m.getId() == id).
                findFirst();
    }
    @Override
    public Iterable<Movie> findAllById(Iterable<Long> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public long count() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteById(Long aLong) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void delete(Movie movie) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll(Iterable<? extends Movie> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void deleteAll() {
        throw new UnsupportedOperationException();
    }

    @Override
    public <S extends Movie> Iterable<S> saveAll(Iterable<S> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {
        throw new UnsupportedOperationException();
    }
}
