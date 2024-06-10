package com.KNUFinal.KNUFinal.repository;

import com.KNUFinal.KNUFinal.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinalRepository extends JpaRepository<Reservation, Long> {
}
