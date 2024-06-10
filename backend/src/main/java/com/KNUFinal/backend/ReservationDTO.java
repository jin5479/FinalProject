package com.KNUFinal.backend;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationDTO {
    private String username;
    private String phone;
    private String startTime;
    private String endTime;
}