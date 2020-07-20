package com.klimek.springLearn2Code.controllers;

import org.springframework.stereotype.*;
import org.springframework.ui.*;
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
    public String getMovies(Model model){
     //napojenie sa na movie repository a nasetovanie na model

        model.addAttribute("movies", movieRepository.findAll());
    }

}
