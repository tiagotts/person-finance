package com.personfinance.modules.user.adaters.input.rest;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.personfinance.modules.user.adaters.input.IUserController;
import com.personfinance.modules.user.adaters.input.model.User;
import com.personfinance.modules.user.core.service.IUserService;



public class UserController implements IUserController{

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public ResponseEntity<User> create(@RequestBody User user) {
        return ResponseEntity.ok(userService.createUser(user));
    }

    @Override
    public ResponseEntity<User> update(@RequestBody User user) {
        return ResponseEntity.ok(userService.updateUser(user));
    }

    @Override
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userService.findAll());
    }
}