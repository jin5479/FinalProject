package com.KNUFinal.KNUFinal.service;
import java.util.List;

import com.KNUFinal.KNUFinal.model.UserDTO;

public interface KnuService {
    List<UserDTO> list();
    UserDTO findById(long id);
    void createUser(UserDTO reservationDTO);
    void updateUser(long id, UserDTO userDTO);
    void deleteUser(long id);

    // void updateReservation(ReservationDTO reservationDTO);

    void deleteReservation(Long id);
}