package com.personfinance.modules.user.domain.service;

import java.util.List;

import com.personfinance.modules.user.domain.model.User;


public interface IUserService {
    User createUser(User user);
    User updateUser(User user);
    void deleteUser(Long id);
    User findById(Long id);
    List<User> findAll();
}
