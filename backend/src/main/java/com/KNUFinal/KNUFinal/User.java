package com.KNUFinal.KNUFinal;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity @Table(name="user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String phoneNumber;
}
