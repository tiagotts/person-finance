package com.personfinance.modules.card.adaters.output.repository.implementation;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.personfinance.modules.card.adaters.input.mapper.CardMapper;
import com.personfinance.modules.card.adaters.input.model.Card;
import com.personfinance.modules.card.adaters.output.persistence.CardJpaRepository;
import com.personfinance.modules.card.adaters.output.repository.CardRepository;
import com.personfinance.modules.card.core.domain.entity.CardEntity;

@Repository
public class CardRepositoryImpl implements CardRepository {

    private final CardJpaRepository cardJpaRepository;
    private final CardMapper cardMapper;

    public CardRepositoryImpl(CardJpaRepository cardJpaRepository, CardMapper cardMapper) {
        this.cardJpaRepository = cardJpaRepository;
        this.cardMapper = cardMapper;
    }

    @Override
    public Card save(Card card) {
        CardEntity entity = cardMapper.toEntity(card);
        CardEntity savedEntity = cardJpaRepository.save(entity);
        return cardMapper.toDomain(savedEntity);
    }

    @Override
    public void delete(Long id) {
        cardJpaRepository.deleteById(id);
    }

    @Override
    public Optional<Card> findById(Long id) {
        return cardJpaRepository.findById(id)
                .map(cardMapper::toDomain);
    }

    @Override
    public List<Card> findAll() {
        return cardJpaRepository.findAll().stream()
                .map(cardMapper::toDomain)
                .collect(Collectors.toList());
    }
}