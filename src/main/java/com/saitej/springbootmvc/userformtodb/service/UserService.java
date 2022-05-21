package com.saitej.springbootmvc.userformtodb.service;

import com.saitej.springbootmvc.userformtodb.dto.UserDTO;

public interface UserService {

    UserDTO saveUser(UserDTO user);
}
