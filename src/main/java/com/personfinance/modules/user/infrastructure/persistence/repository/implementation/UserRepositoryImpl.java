package com.personfinance.modules.user.infrastructure.persistence.repository.implementation;



import org.springframework.stereotype.Repository;

import com.personfinance.modules.user.domain.entity.UserEntity;
import com.personfinance.modules.user.domain.model.User;
import com.personfinance.modules.user.infrastructure.mapper.UserMapper;
import com.personfinance.modules.user.infrastructure.persistence.UserJpaRepository;
import com.personfinance.modules.user.infrastructure.persistence.repository.UserRepository;

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
