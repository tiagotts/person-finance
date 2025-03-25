package com.personfinance.modules.user.adaters.input;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.personfinance.modules.user.adaters.input.model.User;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "*")
public interface IUserController {

    @PostMapping
    ResponseEntity<User> create(@RequestBody User user);

    @PutMapping
    ResponseEntity<User> update(@RequestBody User user);
    
    @DeleteMapping("/{id}")
    ResponseEntity<User> findById(Long id);
    
    @GetMapping("/{id}")
    ResponseEntity<List<User>> findAll();
    
    @GetMapping
    ResponseEntity<Void> delete(@RequestBody Long id);
}
