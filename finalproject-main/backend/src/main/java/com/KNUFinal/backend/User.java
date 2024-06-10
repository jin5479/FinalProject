package com.KNUFinal.backend;

import jakarta.persistence.*;
import lombok.*;


@Getter @Builder @ToString
@NoArgsConstructor @AllArgsConstructor
@Entity @Table(name="movie")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String username;
    private String phone;
    private String startTime;
    private String endTime;
}
