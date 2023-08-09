package com.abr.formationspring.core.repository;

import com.abr.formationspring.core.entity.Movie;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMovieRepository implements MovieRepositoryInterface{

    private File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public void add(Movie movie) {
        FileWriter writer;
        try {
            writer = new FileWriter("A:\\tmp\\movies.txt", true);
            writer.write(movie.getTitle() + ";" + movie.getType() + "\n");
            writer.close();
            System.out.println("Movie " + movie.getTitle() + " has been added");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
