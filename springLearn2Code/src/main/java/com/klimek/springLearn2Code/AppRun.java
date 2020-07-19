package com.klimek.springLearn2Code;

import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.*;

// pomocna trieda AppRun s beanom / spring componentom, tato trieda je v kontajneri springu a spring ju teda bude manazovat

@Component
public class AppRun {

    MovieService movieService;

    public void run(){
        movieService.createAndAddMovie();
    }

}
