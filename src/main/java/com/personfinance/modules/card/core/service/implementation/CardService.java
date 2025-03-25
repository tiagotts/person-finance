package com.personfinance.modules.card.core.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.personfinance.modules.card.adaters.input.model.Card;
import com.personfinance.modules.card.adaters.output.repository.CardRepository;
import com.personfinance.modules.card.core.service.ICardService;

@Service
public class CardService implements ICardService {

    private final CardRepository cardRepository;

    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public Card save(Card card) {
        return cardRepository.save(card);
    }

    @Override
    public void delete(Long id) {
        cardRepository.delete(id);
    }

    @Override
    public Optional<Card> findById(Long id) {
        return cardRepository.findById(id);
    }

    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }
}