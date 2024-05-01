package Dio.me.Santaderdevweek2024.model;

import jakarta.persistence.Entity;

import java.math.BigDecimal;
@Entity(name = "tb_Acout")
public class Accout {

    private Long id;
    private String numero;
    private String agencia;
    private BigDecimal balance;
    private BigDecimal limite;






}
