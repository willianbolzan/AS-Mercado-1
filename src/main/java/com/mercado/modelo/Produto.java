package com.mercado.modelo;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String codigo;
    private String descricao;
    private double preco;
    private List<ItemDeProduto> itensDeProduto;

    public Produto(String codigo, String descricao, double preco) {
        this.itensDeProduto = new ArrayList<ItemDeProduto>();
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }
    public double preco() {
        return this.preco;
    }

    public String descricao() {
        return descricao;
    }

    public void adicionarItem() {
        ItemDeProduto itemDeProduto = new ItemDeProduto(this);
        this.itensDeProduto.add(itemDeProduto);
    }


    public void adicionarItem(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            ItemDeProduto itemDeProduto = new ItemDeProduto(this);
            this.itensDeProduto.add(itemDeProduto);
        }
    }

    public ItemDeProduto itemDeProduto(){
        return this.itensDeProduto.get(0);
    }

    public int quantidade() {
        return this.itensDeProduto.size();
    }

}
