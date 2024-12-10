package com.example.movies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies() {
        //System.out.println(movieRepository.findAll());
        return movieRepository.findAll();
    }

}
