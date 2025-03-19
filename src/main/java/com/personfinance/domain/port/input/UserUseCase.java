package com.personfinance.domain.port.input;

import java.util.List;

import com.personfinance.domain.model.User;

public interface UserUseCase {
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    User findById(Long id);
    List<User> findAll();
}