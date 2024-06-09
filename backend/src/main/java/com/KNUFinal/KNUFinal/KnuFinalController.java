// package com.KNUFinal.KNUFinal;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;

// import java.util.List;


// @RestController
// @CrossOrigin(origins = "*", allowedHeaders = "*")
// public class KnuFinalController {

//     @Autowired private KnuService reservationService;

//     @RequestMapping("/user")
//     public List<UserDTO> list() {
//         return reservationService.list();
//     }

//     @RequestMapping("/user/{id}")
//     public UserDTO movie(@PathVariable long id) {
//         return reservationService.findById(id);
//     }
// }