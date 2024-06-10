package com.crud.service;

import com.crud.entity.Movie;
import com.crud.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public Movie findById(Long id) {
        return movieRepository.findById(id).get();
    }



    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public String update(Long id, Movie movie) {
        movieRepository.save(movie);

        return "Updated Successfully";
    }

    @Override
    public String deleteById(Long id) {
    movieRepository.deleteById(id);
    return "Deleted successfully";
    }
}
