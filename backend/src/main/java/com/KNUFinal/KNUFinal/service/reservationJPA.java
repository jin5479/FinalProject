package com.KNUFinal.KNUFinal.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KNUFinal.KNUFinal.model.Reservation;
import com.KNUFinal.KNUFinal.model.ReservationDTO;
import com.KNUFinal.KNUFinal.repository.reservationRepository;

@Service
public class reservationJPA implements reservationService {

    @Autowired
    private reservationRepository repository;

    
    @Override
    public void createReservation(ReservationDTO reservationDTO){
        Reservation reservation = new Reservation();
        reservation.setUsername(reservationDTO.getUsername());
        reservation.setDate(reservationDTO.getDate());
        reservation.setPassword(reservation.getPassword());
        repository.save(reservation);
    }

    @Override
    public List<ReservationDTO> reservationList() {
       return repository.findAll().stream().map(ReservationDTO::new).collect(Collectors.toList());
    }
    

}
