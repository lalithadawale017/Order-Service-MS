package com.java.projects.Order.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private int userid;
    private String userName;
    private String password;
    private String address;
    private String city;

}
