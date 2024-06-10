package com.KNUFinal.backend.service;

import com.KNUFinal.backend.model.ReservationDTO;
import com.KNUFinal.backend.model.User;
import com.KNUFinal.backend.model.UserDTO;
import com.KNUFinal.backend.repository.KnuFinalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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
    public void createReservation(ReservationDTO reservationDTO) {
        User user = new User();
        user.setUsername(reservationDTO.getUsername());
        user.setPhone(reservationDTO.getPhone());
        user.setStartTime(reservationDTO.getStartTime());
        user.setEndTime(reservationDTO.getEndTime());
        repository.save(user);
    }

    @Override
    public void updateReservation(ReservationDTO reservationDTO) {
        User user = repository.findById(reservationDTO.getId()).orElse(null);
        if (user != null) {
            user.setUsername(reservationDTO.getUsername());
            user.setPhone(reservationDTO.getPhone());
            user.setStartTime(reservationDTO.getStartTime());
            user.setEndTime(reservationDTO.getEndTime());
            repository.save(user);
        }
    }

    @Override
    public void deleteReservation(Long id) {
        repository.deleteById(id);
    }
}