package com.saitej.springbootmvc.userformtodb.repos;

import com.saitej.springbootmvc.userformtodb.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
