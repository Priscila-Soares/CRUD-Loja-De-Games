package com.CRUD.LojaGames;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class ProdutoModel {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String descricao;
	    private Double preco;

	    
	    private Long categoriaId;

	   
	    public Produto() {
	    }

	    public Produto(String nome, String descricao, Double preco, Long categoriaId) {
	        this.nome = nome;
	        this.descricao = descricao;
	        this.preco = preco;
	        this.categoriaId = categoriaId;
	    }

	   
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

	    public String getDescricao() {
	        return descricao;
	    }

	    public void setDescricao(String descricao) {
	        this.descricao = descricao;
	    }

	    public Double getPreco() {
	        return preco;
	    }

	    public void setPreco(Double preco) {
	        this.preco = preco;
	    }

	    public Long getCategoriaId() {
	        return categoriaId;
	    }

	    public void setCategoriaId(Long categoriaId) {
	        this.categoriaId = categoriaId;
	    }
	}


}
