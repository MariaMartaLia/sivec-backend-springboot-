package com.sivec.sivec.produto;

import org.springframework.web.bind.annotation.*;
import java.util.List;

import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PutMapping("/{id}")
public Produto atualizar(@PathVariable Long id, @RequestBody Produto produto) {
    return service.atualizar(id, produto);
}
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return service.salvar(produto);
    }

    @GetMapping
public List<Produto> listar() {
    return service.listar();
}
@GetMapping("/{id}")
public Produto buscarPorId(Long id) {
    return service.buscarPorId(id);
}}