package com.CRUD.LojaGames;

	import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/api/produtos")
	public class ProdutoController {

	    @Autowired
	    private ProdutoRepository produtoRepository;

	    @GetMapping
	    public List<Produto> getAllProdutos() {
	        return produtoRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public Produto getProdutoById(@PathVariable Long id) {
	        return produtoRepository.findById(id).orElse(null);
	    }

	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Produto createProduto(@RequestBody Produto produto) {
	        return produtoRepository.save(produto);
	    }

	    @PutMapping("/{id}")
	    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
	        produto.setId(id);
	        return produtoRepository.save(produto);
	    }

	    @DeleteMapping("/{id}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void deleteProduto(@PathVariable Long id) {
	        produtoRepository.deleteById(id);
	    }

	    @PatchMapping("/{id}")
	    public Produto partialUpdateProduto(@PathVariable Long id, @RequestBody Produto produto) {
	        Produto existingProduto = produtoRepository.findById(id).orElseThrow();
	        if (produto.getNome() != null) {
	            existingProduto.setNome(produto.getNome());
	        }
	        if (produto.getPreco() != null) {
	            existingProduto.setPreco(produto.getPreco());
	        }
	        return produtoRepository.save(existingProduto);
	    }
	}

}
