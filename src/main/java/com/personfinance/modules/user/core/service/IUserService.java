package com.personfinance.modules.user.core.service;

import java.util.List;

import com.personfinance.modules.user.adaters.input.model.User;


public interface IUserService {
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    User findById(Long id);
    List<User> findAll();
}
