package com.KNUFinal.KNUFinal.service;



import java.util.List;

import com.KNUFinal.KNUFinal.model.Reservation;
import com.KNUFinal.KNUFinal.model.ReservationDTO;

public interface reservationService {
    
    List<ReservationDTO> reservationList();
    void createReservation(ReservationDTO reserveDTO);
    void deleteReservation(long id);
    Reservation updateReservation(long id, ReservationDTO reservationDTO);
}
