package com.KNUFinal.KNUFinal.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.KNUFinal.KNUFinal.model.User;
import com.KNUFinal.KNUFinal.model.UserDTO;
import com.KNUFinal.KNUFinal.repository.KnuFinalRepository;

@Service
public class KnuServiceJPA implements KnuService {

    @Autowired
    private KnuFinalRepository repository;

    @Override
    public List<UserDTO> list() {
        return repository.findAll().stream().map(UserDTO::new).collect(Collectors.toList());
    }

    @Override
    public UserDTO findById(long id) {
        return new UserDTO(repository.findById(id).orElse(null));
    }

    @Override
    public void createUser(UserDTO reservationDTO) {
        User user = new User();
        user.setUsername(reservationDTO.getUsername());
        user.setPassword(reservationDTO.getPassword());
        // user.setEndtime(reservationDTO.getEndtime());
        repository.save(user);
    }

    @Override
    public void updateUser(long id, UserDTO userDTO) {
        User user = repository.findById(id).orElse(null);
        if (user != null) {
            user.setUsername(userDTO.getUsername());
            user.setPassword(userDTO.getPassword());
            // user.setEndtime(userDTO.getEndtime());
            repository.save(user);
        }
    }

    @Override
    public void deleteUser(long id) {
        repository.deleteById(id);
    }

    // @Override
    // public void updateReservation(ReservationDTO reservationDTO) {
    //     User user = repository.findById(reservationDTO.getIdx()).orElse(null);
    //     if (user != null) {
    //         user.setUsername(reservationDTO.getUsername());
    //         user.setPhone(reservationDTO.getPhone());
    //         user.setStartTime(reservationDTO.getStartTime());
    //         user.setEndTime(reservationDTO.getEndTime());
    //         repository.save(user);
    //     }
    // }

    @Override
    public void deleteReservation(Long id) {
        repository.deleteById(id);
    }
}
