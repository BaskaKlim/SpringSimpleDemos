package com.klimek.springLearn2Code.initializaters;

import org.springframework.context.*;
import org.springframework.context.event.*;
import com.klimek.springLearn2Code.services.*;

public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    //zavolam movieservice
    
    MovieService movieService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //vytvor film
      movieService.createAndAddMovie();
      movieService.createAndAddMovie();
    }
}
