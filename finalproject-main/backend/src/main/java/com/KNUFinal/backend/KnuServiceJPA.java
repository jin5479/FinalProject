package com.KNUFinal.backend;

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
        return new UserDTO(repository.findById(id).orElseThrow(() -> new RuntimeException("User not found")));
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
    public void updateUser(long id, UserDTO userDTO) {
        User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        user.setUsername(userDTO.getUsername());
        user.setPhone(userDTO.getPhone());
        user.setStartTime(userDTO.getStartTime());
        user.setEndTime(userDTO.getEndTime());
        repository.save(user);
    }

    @Override
    public void deleteUser(long id) {
        repository.deleteById(id);
    }
}