package com.klimek.springLearn2Code.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import com.klimek.springLearn2Code.repositories.*;

@Controller
public class MovieController {

    //injection of movieRepository by using constructor

    MovieRepository movieRepository;


    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }


    @RequestMapping ("/movie")
    public String getMovies(){
     //napojenie sa na movie repository

        movieRepository.findAll();
    }

}
