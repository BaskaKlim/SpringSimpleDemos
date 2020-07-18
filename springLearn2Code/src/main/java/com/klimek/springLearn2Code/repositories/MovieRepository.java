package com.klimek.springLearn2Code.repositories;

import org.springframework.data.repository.*;
import com.klimek.springLearn2Code.models.*;

public interface MovieRepository extends CrudRepository<Movie,Long> {
    

}
