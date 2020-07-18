package com.klimek.springLearn2Code.repositories.implementations;


import org.springframework.stereotype.*;
import com.klimek.springLearn2Code.services.MovieService;
import com.klimek.springLearn2Code.models.Movie;
import com.klimek.springLearn2Code.repositories.MovieRepository;


@Service
public class MovieServiceImpl implements MovieService {


    MovieRepository movieRepository;

    //implementacia movieRepository, movieRepository je springovsky bean, spring nam injectne dependenciu
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    

    @Override
    public Movie createAndAddMovie() {
     Movie movie = new Movie();
     movie.setTitle("Fireproof");

     //teraz to nebude este dobre fungovat, bude to vraciat null, lebo nemozem zavolat nad interfacom, ktory nema implementaciu funkciu
     return movieRepository.save(movie);
    }
}
