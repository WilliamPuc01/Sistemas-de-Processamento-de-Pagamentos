package org.example.services.impl;

import org.example.services.Pagamento;

public class PagamentoBoleto implements Pagamento {

    @Override
    public double calcularValorFinal(double valor) {
        return valor;
    }

    @Override
    public void processarPagamento(double valor) {
        double res = calcularValorFinal(valor);
        System.out.println("PAGAMENTO VIA BOLETO - Valor final: R$: " + valor);
    }
}
