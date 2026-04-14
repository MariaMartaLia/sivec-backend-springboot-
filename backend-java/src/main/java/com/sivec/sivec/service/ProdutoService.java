package com.sivec.sivec.service;

import com.sivec.sivec.model.Produto;
import com.sivec.sivec.repository.ProdutoRepository;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    
    public Produto salvar (Produto produto) {
        return produtoRepository.save(produto);
    }
}
