package com.loja.servico;

import com.loja.dominio.*;

public class SistemaLoja {

    public Compra iniciarCompra(Usuario usuario) {
        return new Compra(usuario);
    }

    public void inserirItem(Compra compra, ProdutoLoja produto, int qtd) {
        compra.adicionarItem(new ItemCompra(produto, qtd));
    }
}
