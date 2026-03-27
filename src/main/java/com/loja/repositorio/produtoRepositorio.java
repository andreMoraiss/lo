package com.loja.repositorio;

import com.loja.dominio.ProdutoLoja;
import java.util.ArrayList;
import java.util.List;

public class ProdutoRepositorio {
    private List<ProdutoLoja> produtos = new ArrayList<>();

    public void salvar(ProdutoLoja p) {
        produtos.add(p);
    }

    public List<ProdutoLoja> obterTodos() {
        return produtos;
    }
}
