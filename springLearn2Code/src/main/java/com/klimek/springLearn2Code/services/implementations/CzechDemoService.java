package com.klimek.springLearn2Code.services.implementations;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.*;

@Service
@Profile("cz")
public class CzechDemoService implements DemoService {

    @Override
    public void sayHello() {
        System.out.println("Hele vole, cau svet!");
    }
}


