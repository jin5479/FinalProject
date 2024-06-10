package com.KNUFinal.KNUFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.KNUFinal.KNUFinal.model.UserDTO;
import com.KNUFinal.KNUFinal.service.KnuService;

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
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
     reservationService.createUser(userDTO);
    return ResponseEntity.ok(userDTO);
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
