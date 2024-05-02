package Dio.me.Santaderdevweek2024.model;

import jakarta.persistence.*;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
@Entity(name = "tb_Acout")
public class Accout {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String numero;
    private String agencia;
    @Column(precision = 13, scale = 2)
    private BigDecimal balance;

    @Column(name = "additional_limit", precision = 13, scale = 2)
    private BigDecimal limite;






}
