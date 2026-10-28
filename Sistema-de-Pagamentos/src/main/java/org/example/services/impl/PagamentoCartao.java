package org.example.services.impl;

import org.example.services.Pagamento;

public class PagamentoCartao implements Pagamento {



    @Override
    public double calcularValorFinal(double valor) {
        double acrescimo = valor * 0.03;
        return valor + acrescimo;
    }

    @Override
    public void processarPagamento(double valor) {
        double res = calcularValorFinal(valor);
        System.out.println("PAGAMENTO VIA CARTAO - Valor final: R$: " + res);

    }
}
