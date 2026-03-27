package com.loja;

import com.loja.dominio.*;
import com.loja.repositorio.*;
import com.loja.servico.*;
import com.loja.pagamento.GatewayPagamento;

public class Aplicacao {

    public static void main(String[] args) {

        // Cliente estático
        Usuario usuario = new Usuario("Carlos", "carlos@email.com");

        // Produtos
        ProdutoLoja p1 = new ProdutoLoja("Teclado", 150);
        ProdutoLoja p2 = new ProdutoLoja("Monitor", 900);

        // Repositório (listagem)
        ProdutoRepositorio repo = new ProdutoRepositorio();
        repo.salvar(p1);
        repo.salvar(p2);

        System.out.println("=== Produtos disponíveis ===");
        for (ProdutoLoja p : repo.obterTodos()) {
            System.out.println(p.getDescricao() + " - R$ " + p.getValor());
        }

        // Criar compra
        SistemaLoja sistema = new SistemaLoja();
        Compra compra = sistema.iniciarCompra(usuario);

        sistema.inserirItem(compra, p1, 1);
        sistema.inserirItem(compra, p2, 2);

        // Finalizar
        GerenciadorCompra gerenciador = new GerenciadorCompra();
        gerenciador.concluirCompra(compra);

        // Pagamento (Singleton)
        Transacao transacao = new Transacao(compra.calcularTotal());
        GatewayPagamento gateway = GatewayPagamento.getInstancia();
        gateway.realizarPagamento(transacao);
    }
}
