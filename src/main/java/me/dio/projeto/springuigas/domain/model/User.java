package me.dio.projeto.springuigas.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private Card card;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL)
    private List<News> news;

    public long getId() {return id;}

    public void setId(long id) {this.id = id;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public List<News> getNews() {return news;}

    public void setNews(List<News> news) {this.news = news;}

    public List<Feature> getFeatures() {return features;}

    public void setFeatures(List<Feature> features) {this.features = features;}

    public Card getCard() {return card;}

    public void setCard(Card card) {this.card = card;}

    public Account getAccount() {return account;}

    public void setAccount(Account account) {this.account = account;}
}
