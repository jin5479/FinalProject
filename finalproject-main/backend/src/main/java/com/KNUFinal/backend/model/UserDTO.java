package com.KNUFinal.backend.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private long id;
    private String username;
    private String phone;
    private String startTime;
    private String endTime;

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.phone = user.getPhone();
        this.startTime = user.getStartTime();
        this.endTime = user.getEndTime();
    }
}