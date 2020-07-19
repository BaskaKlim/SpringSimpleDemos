package com.klimek.springLearn2Code.initializater;

import org.springframework.context.*;
import org.springframework.context.event.*;

public class DataInit implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        throw new UnsupportedOperationException();
    }
}
