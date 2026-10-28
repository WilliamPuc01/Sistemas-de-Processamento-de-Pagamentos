package org.example.entities;

import org.example.enums.StatusPagamento;
import org.example.services.Pagamento;

public class Pedido {

    private StatusPagamento status;
    private double valor;

    public Pedido( double valor) {
        if (valor <= 0) throw new IllegalArgumentException("O valor deve ser positivo");
        this.status = StatusPagamento.PENDENTE;
        this.valor = valor;
    }

    public void pagar(Pagamento pagamento){
        if(status == StatusPagamento.PENDENTE){
            pagamento.processarPagamento(valor);
            status = StatusPagamento.APROVADO;
        }else{
            System.out.println("Pedido já foi processado.");
        }

    }

    public StatusPagamento getStatus(){
        return status;
    }

    public double getValor() {
        return valor;
    }
}
