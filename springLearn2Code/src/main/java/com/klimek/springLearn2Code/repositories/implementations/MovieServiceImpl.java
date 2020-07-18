package com.klimek.springLearn2Code.repositories.implementations;


import com.klimek.springLearn2Code.services.MovieService;
import com.klimek.springLearn2Code.models.Movie;
import com.klimek.springLearn2Code.repositories.MovieRepository;

public class MovieServiceImpl implements MovieService {
    MovieRepository movieRepository;


    @Override
    public Movie createAndAddMovie() {
     Movie movie = new Movie();
     movie.setTitle("Fireproof");

     //teraz to nebude este dobre fungovat, bude to vraciat null, lebo nemozem zavolat nad interfacom, ktory nema implementaciu funkciu
     return movieRepository.save(movie);
    }
}
