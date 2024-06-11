package com.KNUFinal.KNUFinal.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KNUFinal.KNUFinal.model.ReservationDTO;
import com.KNUFinal.KNUFinal.service.reservationService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class adminController{

    @Autowired
    private reservationService reserveService;

    @PostMapping("/admin/checking")
    public ResponseEntity<ReservationDTO> createReservation(@RequestBody ReservationDTO reservationDTO){
        reserveService.createReservation(reservationDTO);
        return ResponseEntity.ok(reservationDTO);
    }
    }
