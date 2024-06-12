package com.KNUFinal.KNUFinal.model;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    private String date;

    public ReservationDTO(Reservation reservation){
        this.idx = reservation.getIdx();
        this.date = reservation.getDate();
    }

}