package com.sivec.sivec.produto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}