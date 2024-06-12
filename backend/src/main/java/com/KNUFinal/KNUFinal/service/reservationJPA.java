package com.KNUFinal.KNUFinal.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.KNUFinal.KNUFinal.model.User;
import com.KNUFinal.KNUFinal.repository.KnuFinalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KNUFinal.KNUFinal.model.Reservation;
import com.KNUFinal.KNUFinal.model.ReservationDTO;
import com.KNUFinal.KNUFinal.repository.reservationRepository;
import org.springframework.transaction.annotation.Transactional;

@Service
public class reservationJPA implements reservationService {

    @Autowired
    private reservationRepository repository;

    @Autowired
    private KnuFinalRepository uesrRepository;

    @Transactional
    @Override
    public void createReservation(ReservationDTO reservationDTO){
        User user = uesrRepository.findById(reservationDTO.getIdx()).orElseThrow(() -> new RuntimeException("User not found"));
        Reservation reservation = new Reservation();
        reservation.setDate(reservationDTO.getDate());
        reservation.setUser(reservationDTO.getUser());
        repository.save(reservation);
    }

    @Override
    public List<ReservationDTO> reservationList() {
       return repository.findAll().stream().map(ReservationDTO::new).collect(Collectors.toList());
    }


    @Override
    public void  deleteReservation(long id) {
        repository.deleteById(id);
        System.out.print("삭제 완료"+id);
    }

    @Transactional
    @Override
    public Reservation  updateReservation(long id,  ReservationDTO reservationDTO){
        User user = uesrRepository.findById(reservationDTO.getIdx())
                .orElseThrow(() -> new RuntimeException("User not found"));
        Reservation reservation = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Reservation not found"));

        reservation.setDate(reservationDTO.getDate());
        reservation.setUser(user);
        return repository.save(reservation);
    }


}
