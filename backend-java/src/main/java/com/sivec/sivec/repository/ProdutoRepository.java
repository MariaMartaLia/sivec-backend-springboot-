package com.sivec.sivec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sivec.sivec.model.Produto;
  
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    // Você pode adicionar métodos personalizados aqui, se necessário
}