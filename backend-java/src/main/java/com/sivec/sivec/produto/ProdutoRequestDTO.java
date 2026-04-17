package com.sivec.sivec.produto;

import  java.math.BigDecimal;

//Record para receber dados de requisição de produto
public  record ProdutoRequestDTO(
        String nome,
        String descricao,
        BigDecimal preco,
        Integer quantidadeEstoque
) {}