package com.personfinance.modules.user.infrastructure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personfinance.modules.user.infrastructure.persistence.entity.UserEntity;


@Repository
public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
