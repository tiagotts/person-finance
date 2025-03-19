package com.personfinance.domain.port.output;

import com.personfinance.domain.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
    void delete(Long id);
    Optional<User> findById(Long id);
    List<User> findAll();
}