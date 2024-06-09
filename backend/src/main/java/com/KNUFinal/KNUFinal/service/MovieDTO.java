package com.KNUFinal.KNUFinal.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@AllArgsConstructor @NoArgsConstructor
public class MovieDTO {
    private String title;
    private String image;
    private String content;

    public MovieDTO(Movie movie){
        title = movie.getTitle();
        image = movie.getImage();
        content = movie.getContent();
    }
}
