package com.klimek.springLearn2Code.models;

import java.util.*;
import javax.persistence.*;

@Entity
public class Movie {

    @Id
    @GeneratedValue
    
    private Long id;
    private String title;

    @ManyToMany
    Set<Director> movies = new HashSet<>();


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

    public Set<Director> getMovies() {
        return movies;
    }

    public void setMovies(Set<Director> newValue) {
        movies = newValue;
    }
}
