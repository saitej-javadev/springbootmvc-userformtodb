package com.saitej.springbootmvc.userformtodb.service;

import com.saitej.springbootmvc.userformtodb.dto.UserDTO;
import com.saitej.springbootmvc.userformtodb.model.User;
import com.saitej.springbootmvc.userformtodb.repos.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = modelMapper.map(userDTO, User.class);
        User saveUser = userRepository.save(user);
       return modelMapper.map(saveUser,UserDTO.class);

    }
}
