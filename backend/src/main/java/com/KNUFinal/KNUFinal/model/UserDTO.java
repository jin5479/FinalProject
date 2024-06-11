package com.KNUFinal.KNUFinal.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    private long idx;
    private String username;
    private String phone;
    private String starttime;
    private String endtime;
    private boolean Approved;

    public UserDTO(User user) {
        this.idx = user.getIdx();
        this.username = user.getUsername();
        this.phone = user.getPhone();
        this.starttime = user.getStarttime();
        this.endtime = user.getEndtime();
        this.Approved = user.isApproved();
    }
}