package com.KNUFinal.KNUFinal.Controller;

import com.KNUFinal.KNUFinal.model.ReservationDTO;
import com.KNUFinal.KNUFinal.model.UserDTO;
import com.KNUFinal.KNUFinal.service.KnuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class KnuFinalController {

    @Autowired
    private KnuService reservationService;

    @GetMapping("/users")
    public List<UserDTO> list() {
        return reservationService.list();
    }

    @GetMapping("/user/{id}")
    public UserDTO user(@PathVariable long id) {
        return reservationService.findById(id);
    }

    @PostMapping("/reservation")
    public ResponseEntity<?> createReservation(@RequestBody ReservationDTO reservationDTO) {
        reservationService.createReservation(reservationDTO);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> updateUser(@PathVariable long id, @RequestBody UserDTO userDTO) {
        reservationService.updateUser(id, userDTO);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable long id) {
        reservationService.deleteUser(id);
        return ResponseEntity.ok().build();
    }
}