package com.CRUD.LojaGames;

import java.util.List;

import javax.persistence.*;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
    private List<Produto> produtos;

    // Getters and Setters
}

