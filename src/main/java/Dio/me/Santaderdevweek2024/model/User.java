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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Accout getAccout() {
        return accout;
    }

    public void setAccout(Accout accout) {
        this.accout = accout;
    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
