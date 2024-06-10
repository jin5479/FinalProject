package com.KNUFinal.KNUFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/movie")
    public Movie postMethodName(@RequestBody MovieDTO movieDTO) {
        //TODO: process POST request
        
        return movieService.createMovie(movieDTO);
    }
    
}
