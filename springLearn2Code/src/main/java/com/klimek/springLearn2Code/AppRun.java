package com.klimek.springLearn2Code;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.*;

// pomocna trieda AppRun s beanom / spring componentom, tato trieda je v kontajneri springu a spring ju teda bude manazovat

@Component
public class AppRun {
    //TODO: dotiahnut zo springu aj implementaciu movieService -> dependency injection

    /* da sa to pomocou konstruktoru alebo pomocou @Autowired */

    /*@Autowired
    MovieService movieService;

    public void run() {
        movieService.createAndAddMovie();
    } */

    //TODO: dotiahnut DemoService a spustit
    @Autowired
    @Qualifier("slovakDemoService")
    DemoService demoService;

    public void run() {
        demoService.sayHello();

    }


}
