package com.personfinance.infrastructure.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personfinance.infrastructure.persistence.entity.UserEntity;

@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}