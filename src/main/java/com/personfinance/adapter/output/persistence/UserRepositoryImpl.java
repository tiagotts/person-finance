package com.personfinance.adapter.output.persistence;

import com.personfinance.domain.model.User;
import com.personfinance.domain.port.output.UserRepository;
import com.personfinance.infrastructure.persistence.entity.UserEntity;
import com.personfinance.infrastructure.persistence.repository.UserJpaRepository;
import com.personfinance.infrastructure.mapper.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryImpl implements UserRepository {

    private final UserJpaRepository userJpaRepository;
    private final UserMapper userMapper;

    public UserRepositoryImpl(UserJpaRepository userJpaRepository, UserMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }


    @Override
    public User save(User user) {
        UserEntity entity = userMapper.toEntity(user);
        entity = userJpaRepository.save(entity);
        return userMapper.toDomain(entity);
    }

    @Override
    public void delete(Long id) {
        userJpaRepository.deleteById(id);
    }

    @Override
    public Optional<User> findById(Long id) {
        return userJpaRepository.findById(id)
                .map(userMapper::toDomain);
    }

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll().stream()
                .map(userMapper::toDomain)
                .collect(Collectors.toList());
    }
}