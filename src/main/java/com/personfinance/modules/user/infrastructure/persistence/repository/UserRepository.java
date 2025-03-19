package com.personfinance.modules.user.infrastructure.persistence.repository;

import java.util.List;
import java.util.Optional;

import com.personfinance.modules.user.domain.model.User;



public interface UserRepository {
    User save(User user);
    void delete(Long id);
    Optional<User> findById(Long id);
    List<User> findAll();
}