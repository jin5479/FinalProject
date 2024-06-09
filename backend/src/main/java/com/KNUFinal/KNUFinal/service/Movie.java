package com.KNUFinal.KNUFinal.service;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter @Builder
@ToString
@NoArgsConstructor@AllArgsConstructor
@Entity@Table(name="movie")
public class Movie {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long idx;
    private String title;
    private String image;
    private String content;
    
}
