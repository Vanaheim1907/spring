package com.abr.formationspring.core.repository;

import com.abr.formationspring.core.entity.Movie;

import java.util.ArrayList;
import java.util.List;

public class MemoryMovieRepository implements MovieRepositoryInterface{

    private static List<Movie> movieList = new ArrayList<>();

    public void add(Movie movie){
        movieList.add(movie);
        System.out.println("Movie " + movie.getTitle() + " has been added");

    }
}
