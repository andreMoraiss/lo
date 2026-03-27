package com.loja.dominio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private Usuario usuario;
    private List<ItemCompra> itens = new ArrayList<>();

    public Compra(Usuario usuario) {
        this.usuario = usuario;
    }

    public void adicionarItem(ItemCompra item) {
        itens.add(item);
    }

    public double calcularTotal() {
        double soma = 0;
        for (ItemCompra item : itens) {
            soma += item.calcularParcial();
        }
        return soma;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<ItemCompra> getItens() {
        return itens;
    }
}
