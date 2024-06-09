package com.KNUFinal.KNUFinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public Movie createMovie(MovieDTO movieDTO) {
        Movie movie = Movie.builder()
                .title(movieDTO.getTitle())
                .image(movieDTO.getImage())
                .content(movieDTO.getContent())
                .build();

        return movieRepository.save(movie);
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieById(Long id) {
        return movieRepository.findById(id);
    }

    public Movie updateMovie(Long id, MovieDTO movieDTO) {
        return movieRepository.findById(id).map(movie -> {
            movie.setTitle(movieDTO.getTitle());
            movie.setImage(movieDTO.getImage());
            movie.setContent(movieDTO.getContent());
            return movieRepository.save(movie);
        }).orElseThrow(() -> new RuntimeException("Movie not found"));
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }
}
