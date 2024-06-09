package com.KNUFinal.KNUFinal.service;

import com.KNUFinal.KNUFinal.model.Reservation;
import com.KNUFinal.KNUFinal.repository.FinalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final FinalRepository finalRepository;

    @Autowired
    public ReservationService(FinalRepository finalRepository) {
        this.finalRepository = finalRepository;
    }

    public Reservation createReservation(Reservation reservation) {
        return finalRepository.save(reservation);
    }

    public Optional<Reservation> getReservation(Long id) {
        return finalRepository.findById(id);
    }

    public List<Reservation> getAllReservations() {
        return finalRepository.findAll();
    }

    public void deleteReservation(Long id) {
        finalRepository.deleteById(id);
    }
}
