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
    private String password;
    // private String endtime;

    public UserDTO(User user) {
        this.idx = user.getIdx();
        this.username = user.getUsername();
        this.password = user.getPassword();
        // this.starttime = user.getStarttime();
        // this.endtime = user.getEndtime();
    }
}