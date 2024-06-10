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
    private String phone;
    private String startTime;
    private String endTime;
}