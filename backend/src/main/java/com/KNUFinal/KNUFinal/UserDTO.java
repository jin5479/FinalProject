package com.KNUFinal.KNUFinal;

import lombok.*;

@Getter @Setter @ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private long id;
    private String name;
    private String phoneNumber;

    public UserDTO(UserDTO userDTO) {
        id = userDTO.getId();
        name = userDTO.getName();
        phoneNumber = userDTO.getPhoneNumber();
    }
}
