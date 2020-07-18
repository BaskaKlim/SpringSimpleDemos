package com.klimek.springLearn2Code.models;

import java.util.*;
import javax.persistence.*;

@Entity
public class Director {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToMany (mappedBy = "directors")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Director)) return false;
        Director director = (Director) o;
        return getId().equals(director.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
