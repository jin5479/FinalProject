package com.KNUFinal.KNUFinal.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users") // 테이블 이름 명시
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;

    @Column(name = "username") // 컬럼 이름 명시
    private String username;

    @Column(name = "phone") // 컬럼 이름 명시
    private String phone;

    @Column(name = "start_time") // 컬럼 이름 명시
    private String startTime;

    @Column(name = "end_time") // 컬럼 이름 명시
    private String endTime;
}
