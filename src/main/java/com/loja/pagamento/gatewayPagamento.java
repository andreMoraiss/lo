package com.loja.pagamento;

import com.loja.dominio.Transacao;

/*
 Singleton aplicado para garantir apenas uma instância do gateway
 de pagamento, simulando uma única conexão com sistema externo.
*/
public class GatewayPagamento {

    private static GatewayPagamento instancia;

    private GatewayPagamento() {}

    public static GatewayPagamento getInstancia() {
        if (instancia == null) {
            instancia = new GatewayPagamento();
        }
        return instancia;
    }

    public void realizarPagamento(Transacao t) {
        System.out.println("Pagamento aprovado no valor de R$ " + t.getValor());
    }
}
