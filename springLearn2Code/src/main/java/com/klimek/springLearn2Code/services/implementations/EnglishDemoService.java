package com.klimek.springLearn2Code.services.implementations;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.*;

@Service
public class EnglishDemoService implements DemoService {

    @Override
    @Profile("eng")
    
    public void sayHello() {
        System.out.println("hi world!");
    }
}

