package com.klimek.springLearn2Code.controllers;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
public class MovieController {

    @RequestMapping ("/movie")
    public String getMovies(){
      return "movie";
    }

}
