package com.personfinance.modules.card.adaters.input.model;

import java.math.BigDecimal;

import com.personfinance.modules.user.adaters.input.model.User;

import lombok.Data;

@Data
public class Card {

    private Long id;
    private String cardNumber;
    private User user;
    private String name;
    private BigDecimal limit;
    private Integer dayPayment;
}
