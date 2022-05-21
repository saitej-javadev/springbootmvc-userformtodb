package com.saitej.springbootmvc.userformtodb;

import com.saitej.springbootmvc.userformtodb.dto.UserDTO;
import com.saitej.springbootmvc.userformtodb.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SpringbootmvcUserFormToDBApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    void testSaveUser() {
        UserDTO userDTO = new UserDTO();
        userDTO.setFirstName("Micheal");
        userDTO.setLastName("Jackson");
        userDTO.setMobileNumber(9565856548L);
        userDTO.setPassword("popstar");
        UserDTO savedUser = userService.saveUser(userDTO);
        System.out.println(savedUser);
        assertNotNull(savedUser);

    }

}
