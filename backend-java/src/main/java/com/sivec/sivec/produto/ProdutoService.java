package com.sivec.sivec.produto;

import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto buscarPorId(Long id) {
    return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
}
public Produto atualizar(Long id, Produto produtoAtualizado) {
    Produto produto = repository.findById(id)
        .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

    produto.setNome(produtoAtualizado.getNome());
    produto.setDescricao(produtoAtualizado.getDescricao());
    produto.setPreco(produtoAtualizado.getPreco());
    produto.setQuantidade(produtoAtualizado.getQuantidade());

    return repository.save(produto);

}
    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listar() {
        return repository.findAll();
    }
}
