package Dio.me.Santaderdevweek2024.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
@Entity(name = "tb_card")
public class Card {



    private String numero;
    private BigDecimal limite;


}
