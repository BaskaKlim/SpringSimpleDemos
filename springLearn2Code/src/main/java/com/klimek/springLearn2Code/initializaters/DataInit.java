package com.klimek.springLearn2Code.initializaters;

import org.springframework.context.*;
import org.springframework.context.event.*;
import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.*;

@Component
public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    //zavolam movieservice

    MovieService movieService;

    //konstruktor kde si zavolam rovno movieServisu

    public DataInit(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //vytvor film
      movieService.createAndAddMovie();
      movieService.createAndAddMovie();
    }
}
