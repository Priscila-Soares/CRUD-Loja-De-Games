package com.CRUD.LojaGames.repository;

package com.CRUD.LojaGames.loja.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

	public List<Produto> findAllByNomeContainingIgnoreCase(@Param("produto") String produto);