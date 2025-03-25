package com.personfinance.modules.card.adaters.input.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.personfinance.modules.card.adaters.input.model.Card;
import com.personfinance.modules.card.core.domain.entity.CardEntity;

@Mapper(componentModel = "spring")
public interface CardMapper {
    
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "cardNumber", source = "cardNumber")
    @Mapping(target = "limit", source = "limit")
    @Mapping(target = "dayPayment", source = "dayPayment")
    @Mapping(target = "user", source = "user")
    Card toDomain(CardEntity entity);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    @Mapping(target = "cardNumber", source = "cardNumber")
    @Mapping(target = "limit", source = "limit")
    @Mapping(target = "dayPayment", source = "dayPayment")
    @Mapping(target = "user", source = "user")
    @Mapping(target = "createdAt", ignore=true)
    CardEntity toEntity(Card domain);
   
}