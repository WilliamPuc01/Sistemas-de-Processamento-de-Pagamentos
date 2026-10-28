package org.example.services;

public interface Pagamento {
    double calcularValorFinal(double valor);
    void processarPagamento(double valor);
}
