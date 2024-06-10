package com.KNUFinal.backend;

import java.util.List;

public interface KnuService {
    List<UserDTO> list();
    UserDTO findById(long id);
    void createReservation(ReservationDTO reservationDTO);
    void updateUser(long id, UserDTO userDTO);
    void deleteUser(long id);
}