package com.personfinance.application.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personfinance.domain.exception.ResourceNotFoundException;
import com.personfinance.domain.model.User;
import com.personfinance.domain.port.input.UserUseCase;
import com.personfinance.domain.port.output.UserRepository;

@Service
public class UserService implements UserUseCase {
    
    private static final Logger logger = LoggerFactory.getLogger(UserService.class);
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional
    public User createUser(User user) {
        logger.info("Creating new user with email: {}", user.getEmail());
        validateUser(user);
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public User updateUser(User user) {
        logger.info("Updating user with ID: {}", user.getId());
        validateUser(user);
        findById(user.getId()); // Verify if user exists
        return userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        logger.info("Deleting user with ID: {}", id);
        findById(id); // Verify if user exists
        userRepository.delete(id);
    }

    @Override
    public User findById(Long id) {
        logger.debug("Finding user by ID: {}", id);
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
    }

    @Override
    public List<User> findAll() {
        logger.debug("Finding all users");
        return userRepository.findAll();
    }

    private void validateUser(User user) {
        if (user.getEmail() == null || user.getEmail().trim().isEmpty()) {
            throw new IllegalArgumentException("Email cannot be empty");
        }
        if (user.getName() == null || user.getName().trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        if (user.getPassword() == null || user.getPassword().trim().isEmpty()) {
            throw new IllegalArgumentException("Password cannot be empty");
        }
    }

}