package com.klimek.springLearn2Code.services.implementations;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.*;

@Service
@Profile("eng")
public class EnglishDemoService implements DemoService {

    @Override

    
    public void sayHello() {
        System.out.println("hi world!");
    }
}

