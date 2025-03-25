package com.personfinance.modules.card.adaters.output.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personfinance.modules.card.core.domain.entity.CardEntity;

@Repository
public interface CardJpaRepository extends JpaRepository<CardEntity, Long> {
}