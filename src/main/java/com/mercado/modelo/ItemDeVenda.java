package com.mercado.modelo;

public class ItemDeVenda {
    private ItemDeProduto itemDeProduto;
    private int quantidade;

    public ItemDeVenda(ItemDeProduto itemDeProduto, int quantidade) {
        this.itemDeProduto = itemDeProduto;
        this.quantidade = quantidade;
    }

    public int quantidade() {
        return this.quantidade;
    }

    public double precoDoProduto(){
        return itemDeProduto.preco();
    }


}
