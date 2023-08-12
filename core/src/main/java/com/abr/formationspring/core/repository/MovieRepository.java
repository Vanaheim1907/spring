package com.abr.formationspring.core.repository;

import com.abr.formationspring.core.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.util.List;

@Repository
public class MovieRepository implements MovieRepositoryInterface{

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Override
    public Movie add(Movie movie) {
        KeyHolder kh = new GeneratedKeyHolder();

        jdbcTemplate.update(connection -> {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO dvdstore.movie (TITLE, GENRE, DESCRIPTION) VALUES(?,?,?)",PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,movie.getTitle());
            preparedStatement.setString(2,movie.getType());
            preparedStatement.setString(3, movie.getDescription());
            return preparedStatement;
        },kh);

        movie.setId(kh.getKey().longValue());
        return movie;
    }

    @Override
    public List<Movie> list() {

        return jdbcTemplate.query("SELECT ID, TITLE, GENRE FROM dvdstore.movie",(rs,rowNum) -> new Movie(rs.getLong("ID"),
                rs.getString("TITLE"), rs.getString("GENRE")));

    }

    @Override
    public Movie getById(Long id) {

        return jdbcTemplate.queryForObject("SELECT ID, TITLE, GENRE, DESCRIPTION FROM dvdstore.movie where ID = ?",new Object[]{id},(rs,rowNum) -> new Movie(rs.getLong("ID"),
                rs.getString("TITLE"), rs.getString("GENRE"), rs.getString("DESCRIPTION")));

    }
}
