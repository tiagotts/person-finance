package com.personfinance.modules.user.adaters.output.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personfinance.modules.user.core.domain.entity.UserEntity;


@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
