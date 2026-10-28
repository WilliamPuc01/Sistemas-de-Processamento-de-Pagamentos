package org.example.services.impl;

import org.example.services.Pagamento;

public class PagamentoPix implements Pagamento {


    @Override
    public double calcularValorFinal(double valor) {
        return valor * 0.95;
    }

    @Override
    public void processarPagamento(double valor) {
        double res = calcularValorFinal(valor);
        System.out.println("PAGAMENTO VIA PIX - Valor final: R$: " + res);
    }

}
