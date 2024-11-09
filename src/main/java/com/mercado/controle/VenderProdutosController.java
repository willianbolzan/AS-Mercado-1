package com.mercado.controle;

import com.mercado.modelo.*;
import com.mercado.modelo.repositorios.Repositorio;


public class VenderProdutosController {
private Repositorio repositorio;
private Venda vendaCorrente;

    public VenderProdutosController(Repositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void iniciarNovaVenda() {
        this.vendaCorrente = new Venda(repositorio);
    }

    public void encerrarEntradaDeItem() {
        this.vendaCorrente.encerrarEntradaDeItem();
    }

    public void entrarItem(String codigo, int quantidade) {
        Produto produto = this.repositorio.obterProdutoPeloCodigo(codigo);
        ItemDeProduto itemDeProduto = produto.itemDeProduto();
        this.vendaCorrente.entrarItem(itemDeProduto, quantidade);
    }
}
