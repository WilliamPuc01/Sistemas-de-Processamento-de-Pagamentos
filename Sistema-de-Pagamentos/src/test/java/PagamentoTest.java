import org.example.entities.Pedido;
import org.example.enums.StatusPagamento;
import org.example.services.Pagamento;
import org.example.services.impl.PagamentoPix;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.assertEquals;

public class PagamentoTest {

    @Mock
    private Pedido pedido ;


    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void deveAplicarDescontoDe5PorCento() {
        // Cenario
        Pagamento pagamento = new PagamentoPix();

        // Acao
        double resultado = pagamento.calcularValorFinal(100.0);

        // verificacao
        assertEquals(95.0, resultado, 0.001);
    }

    @Test
     public void deveIniciarComStatusPendente() {
        Pedido pedido = new Pedido(100.0);

        assertEquals(StatusPagamento.PENDENTE, pedido.getStatus());
    }

    @Test
    public void deveFicarAprovadoAposPagar() {
        Pedido pedido = new Pedido(100.0);
        Pagamento pix = new PagamentoPix();

        pedido.pagar(pix);

        assertEquals(StatusPagamento.APROVADO, pedido.getStatus());
    }
}
