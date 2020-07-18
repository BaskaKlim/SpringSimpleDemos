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
    @JoinTable(name = "movie_director",
    joinColumns = @JoinColumn(name = "movie_id"),
    inverseJoinColumns = @JoinColumn(name = "director_id"))

            
    Set<Director> directors = new HashSet<>();

    public Movie() {

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

    public Set<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(Set<Director> newValue) {
        directors = newValue;
    }
}
