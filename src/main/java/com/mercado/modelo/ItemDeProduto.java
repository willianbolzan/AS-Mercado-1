package com.mercado.modelo;

public class ItemDeProduto {
    private Produto produto;
    public ItemDeProduto(Produto produto) {
        this.produto = produto;
    }

    public String descricao() {
        return produto.descricao();
    }

    public double preco() {
        return produto.preco();
    }

}
