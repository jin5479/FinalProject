package com.KNUFinal.KNUFinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class KnuServiceJPA implements KnuService {

    @Autowired
    private KnuFinalRepository repository;

    @Override
    public List<UserDTO> list(){
        return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(long id){
        return new UserDTO(repository.findById(id).get());
    }
}
