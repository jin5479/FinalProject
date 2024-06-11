package com.KNUFinal.KNUFinal.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    private String username;
    private String phone;
    private String starttime;
    private String endtime;
    private boolean Approved;
}
