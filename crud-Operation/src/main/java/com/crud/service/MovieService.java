package com.crud.service;

import com.crud.entity.Movie;

import java.util.List;

public interface MovieService {
    //creating-post
    public Movie save(Movie movie);

//    getById-get
    public Movie findById(Long id);

    //getMapping
    public List<Movie>findAll();
    //put
    public String update(Long id,Movie movie);
    //delete
    public String deleteById(Long id);


}
