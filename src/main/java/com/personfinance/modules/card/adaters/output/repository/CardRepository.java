package com.personfinance.modules.card.adaters.output.repository;

import java.util.List;
import java.util.Optional;

import com.personfinance.modules.card.adaters.input.model.Card;

public interface CardRepository {
    Card save(Card card);
    void delete(Long id);
    Optional<Card> findById(Long id);
    List<Card> findAll();
}