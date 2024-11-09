package com.mercado.modelo.repositorios;

import com.mercado.modelo.Produto;

public interface Repositorio {

    Produto obterProdutoPeloCodigo(String codigo);
}
