package com.CRUD.LojaGames;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

	@RestController
	@RequestMapping("/api/categorias")
	public class CategoriaController {

	    @Autowired
	    private CategoriaRepository categoriaRepository;

	    @GetMapping
	    public List<Categoria> getAllCategorias() {
	        return categoriaRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public Categoria getCategoriaById(@PathVariable Long id) {
	        return categoriaRepository.findById(id).orElse(null);
	    }

	    @PostMapping
	    @ResponseStatus(HttpStatus.CREATED)
	    public Categoria createCategoria(@RequestBody Categoria categoria) {
	        return categoriaRepository.save(categoria);
	    }

	    @PutMapping("/{id}")
	    public Categoria updateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
	        categoria.setId(id);
	        return categoriaRepository.save(categoria);
	    }

	    @DeleteMapping("/{id}")
	    @ResponseStatus(HttpStatus.NO_CONTENT)
	    public void deleteCategoria(@PathVariable Long id) {
	        categoriaRepository.deleteById(id);
	    }

	    @PatchMapping("/{id}")
	    public Categoria partialUpdateCategoria(@PathVariable Long id, @RequestBody Categoria categoria) {
	        Categoria existingCategoria = categoriaRepository.findById(id).orElseThrow();
	        if (categoria.getNome() != null) {
	            existingCategoria.setNome(categoria.getNome());
	        }
	        return categoriaRepository.save(existingCategoria);
	    }
	}

