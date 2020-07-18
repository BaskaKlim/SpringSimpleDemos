package com.klimek.springLearn2Code.models;

import java.util.*;
import javax.persistence.*;

@Entity
public class Director {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany
    Set<Movie>  movies = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long newValue) {
        id = newValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String newValue) {
        name = newValue;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public void setMovies(Set<Movie> newValue) {
        movies = newValue;
    }
}
