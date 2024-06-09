package com.KNUFinal.KNUFinal.service;

import com.KNUFinal.KNUFinal.model.Reservation;
import com.KNUFinal.KNUFinal.repository.FinalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReservationServiceImpl implements ReservationService {

    private final FinalRepository finalRepository;

    @Autowired
    public ReservationServiceImpl(FinalRepository finalRepository) {
        this.finalRepository = finalRepository;
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return finalRepository.save(reservation);
    }

    @Override
    public Optional<Reservation> getReservation(Long id) {
        return finalRepository.findById(id);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return finalRepository.findAll();
    }

    @Override
    public void deleteReservation(Long id) {
        finalRepository.deleteById(id);
    }
}
