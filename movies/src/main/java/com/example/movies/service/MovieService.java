package com.example.movies.service;

import com.example.movies.entity.Movie;
import com.example.movies.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        //System.out.println(movieRepository.findAll());
        return movieRepository.findAll();
    }
    public Optional<Movie> MovieById(String id){
        return movieRepository.findMovieByImdbId(id);

    }

}
