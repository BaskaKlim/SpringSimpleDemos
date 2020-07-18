package com.klimek.springLearn2Code.models;

import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    
    private Long id;
    private String title;


    public Movie(){

     }

    public Long getId() {
        return id;
    }

    public void setId(Long newValue) {
        id = newValue;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newValue) {
        title = newValue;
    }



}
