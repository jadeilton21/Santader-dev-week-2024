package Dio.me.Santaderdevweek2024.model;

import jakarta.persistence.*;

import java.util.List;
@Entity(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    @OneToOne(cascade = CascadeType.ALL)
    private Accout accout;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Facture> facture;
    @OneToOne(cascade = CascadeType.ALL)
    private Card card ;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<News> news;


}
