package com.KNUFinal.KNUFinal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.KNUFinal.KNUFinal.model.Reservation;

@Repository
public interface reservationRepository extends JpaRepository<Reservation, Long> {};
