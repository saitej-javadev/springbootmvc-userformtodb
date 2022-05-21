package com.saitej.springbootmvc.userformtodb.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserDTO {

    private String firstName;
    private String lastName;
    private Long mobileNumber;
    private String password;
}
