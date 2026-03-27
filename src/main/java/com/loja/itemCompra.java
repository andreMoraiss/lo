package com.loja.dominio;

public class ItemCompra {
    private ProdutoLoja produto;
    private int quantidade;

    public ItemCompra(ProdutoLoja produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double calcularParcial() {
        return produto.getValor() * quantidade;
    }

    public ProdutoLoja getProduto() {
        return produto;
    }
}
