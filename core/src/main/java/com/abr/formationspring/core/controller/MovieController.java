package com.abr.formationspring.core.controller;

import com.abr.formationspring.core.entity.Movie;
import com.abr.formationspring.core.service.MovieServiceInterface;

import java.util.Scanner;

public class MovieController {
    private MovieServiceInterface service;

    public MovieServiceInterface getService() {
        return service;
    }

    public void setService(MovieServiceInterface service) {
        this.service = service;
    }

    public void addUsingConsole(){
        System.out.printf("Enter the title of the new movie");
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.printf("Enter the type of the new movie");
        String type = sc.nextLine();

        Movie movie	 = new Movie();
        movie.setTitle(title);
        movie.setType(type);


        service.registerMovie(movie);
    }
}
