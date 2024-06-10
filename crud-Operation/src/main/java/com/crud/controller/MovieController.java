package com.crud.controller;

import com.crud.entity.Movie;
import com.crud.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class MovieController {
    @Autowired
    private MovieService movieService;
    @PostMapping("create")
    public Movie save(@RequestBody Movie movie) {
        return movieService.save(movie);
    }

    @GetMapping("/{id}")
    public Movie getById(@PathVariable Long id) {
        return movieService.findById(id);
    }

    @GetMapping("allMovies")
    public List<Movie> findAll() {
        return movieService.findAll();
    }

    @PutMapping("/update/{id}")
    public String update(@PathVariable Long id, @RequestBody Movie movie) {
        movieService.update(id,movie);

        return "Updated Successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable Long id) {
        movieService.deleteById(id);
        return "Deleted successfully";
    }
}
