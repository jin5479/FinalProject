package com.KNUFinal.KNUFinal.service;
import com.KNUFinal.KNUFinal.model.ReservationDTO;
import com.KNUFinal.KNUFinal.model.UserDTO;

import java.util.List;

public interface KnuService {
    List<UserDTO> list();
    UserDTO findById(long id);
    void createReservation(ReservationDTO reservationDTO);
    void updateUser(long id, UserDTO userDTO);
    void deleteUser(long id);

    void updateReservation(ReservationDTO reservationDTO);

    void deleteReservation(Long id);
}