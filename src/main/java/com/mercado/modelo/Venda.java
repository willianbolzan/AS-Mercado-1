package com.mercado.modelo;

import com.mercado.modelo.repositorios.Repositorio;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<ItemDeVenda> itensDeVenda;
    private boolean entradaDeItemCompleta;
    private Repositorio repositorio;


    public Venda(Repositorio repositorio) {
        this.itensDeVenda = new ArrayList<>();
        this.entradaDeItemCompleta = false;
        this.repositorio = repositorio;
    }

    public void encerrarEntradaDeItem() {
        this.entradaDeItemCompleta = true;
    }

    public void entrarItem(ItemDeProduto itemDeProduto, int quantidade) {
        ItemDeVenda itemDeVenda = new ItemDeVenda(itemDeProduto, quantidade);
        this.adicionarItem(itemDeVenda);
    }

    private void adicionarItem(ItemDeVenda itemDeVenda) {
        this.itensDeVenda.add(itemDeVenda);
    }
}
