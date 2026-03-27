package com.loja.servico;

import com.loja.dominio.Compra;

public class GerenciadorCompra {

    public void concluirCompra(Compra compra) {
        System.out.println("Compra realizada por: " + compra.getUsuario().getNome());
        System.out.println("Total da compra: R$ " + compra.calcularTotal());
    }
}
