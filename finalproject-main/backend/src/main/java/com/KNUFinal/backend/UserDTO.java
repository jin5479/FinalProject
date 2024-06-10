package com.KNUFinal.backend;


import lombok.*;


@AllArgsConstructor  @NoArgsConstructor
@Getter @Setter @ToString
public class UserDTO {
    private long idx;
    private String username;
    private String phone;

    public UserDTO(User user) {
        idx = user.getId();
        username = user.getUsername();
        phone = user.getPhone();
    }
}
