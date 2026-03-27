package com.loja.dominio;

public class ProdutoLoja {
    private String descricao;
    private double valor;

    public ProdutoLoja(String descricao, double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }
}
