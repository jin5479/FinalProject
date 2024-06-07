package com.KNUFinal.KNUFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class KnuFinalController {
    @Autowired private KnuService knuService;

    @RequestMapping("/test")
    public List<UserDTO> list(){
        return knuService.list();
    }

    @RequestMapping("/test/{id}")
    public UserDTO user(@PathVariable long id){
        return knuService.findById(id);
    }
}
