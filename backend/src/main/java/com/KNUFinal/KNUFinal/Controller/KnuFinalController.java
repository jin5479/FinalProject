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
import com.KNUFinal.KNUFinal.service.reservationService;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class KnuFinalController {

    @Autowired
    private KnuService reservationService;

    @Autowired
    private reservationService reserveService;


    //사용자가 입력한 정보(user테이블의 db)를 어드민 페이지에서 테이블 형식으로 출력
    @GetMapping("/admin/users")
    public List<UserDTO> list() {
        return reservationService.list();
    }

    @GetMapping("/user/{id}")
    public UserDTO user(@PathVariable long id) {
        return reservationService.findById(id);
    }


    //사용자가 정보 입력하고 보낼때 (user테이블에 db생성) 즉, 사용자 -> 어드민
    @PostMapping("/reservation")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
     reservationService.createUser(userDTO);
    return ResponseEntity.ok(userDTO);
    }


    // //어드민 페이지에서 reservation테이블로 전송
    // @PostMapping("/admin/checking")
    // public ResponseEntity<ReservationDTO> createReservation(@RequestBody ReservationDTO reservationDTO){
    //     reserveService.createReservation(reservationDTO);
    //     return ResponseEntity.ok(reservationDTO);
    // }


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
