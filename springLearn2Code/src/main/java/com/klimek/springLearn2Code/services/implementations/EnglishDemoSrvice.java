package com.klimek.springLearn2Code.services.implementations;

import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.*;

@Service
public class EnglishDemoSrvice implements DemoService {

    @Override
    public void sayHello() {
        System.out.println("hi world!");
    }
}

