package com.KNUFinal.KNUFinal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ReservationDTO {
    private Long idx;
    private String username;
    private String date;
    private String password;

    public ReservationDTO(Reservation reservation){
        this.idx = reservation.getIdx();
        this.username = reservation.getUsername();
        this.date = reservation.getDate();
        this.password = reservation.getPassword();
    }

}