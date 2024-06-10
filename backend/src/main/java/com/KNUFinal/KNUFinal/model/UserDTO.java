package com.KNUFinal.KNUFinal.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private long idx;
    private String username;
    private String phone;
    private String startTime;
    private String endTime;

    public UserDTO(User user) {
        this.idx = user.getIdx();
        this.username = user.getUsername();
        this.phone = user.getPhone();
        this.startTime = user.getStartTime();
        this.endTime = user.getEndTime();
    }
}