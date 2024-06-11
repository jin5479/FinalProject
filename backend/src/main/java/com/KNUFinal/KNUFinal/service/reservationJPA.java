package com.KNUFinal.KNUFinal.service;

import java.util.List;
import java.util.Optional;
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
        reservation.setPassword(reservationDTO.getPassword());
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

    @Override
    public Reservation  updateReservation(long id,  ReservationDTO reservationDTO){
        //Optional 기능을 통해 값이 없는 null인 경우 Optional.Empty를 반환 해 예외 방지
        Optional<Reservation> optionalReservation = repository.findById(id);

        if (optionalReservation.isPresent()) {
            Reservation reservation = optionalReservation.get();
            reservation.setUsername(reservationDTO.getUsername());
            reservation.setDate(reservationDTO.getDate());
            reservation.setPassword(reservationDTO.getPassword());
            return repository.save(reservation);
        } else {
            throw new RuntimeException("Reservation not found with id " + id);
        }
    }


}
