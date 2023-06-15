package chapter06;

import chapter05.*;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CarrinhoDeComprasTest {
    
    private CarrinhoDeComprasBuilder carrinhoBuilder;
    
    @Before
    public void inicializa() {
        this.carrinhoBuilder = new CarrinhoDeComprasBuilder();
    }
    
    @Test
    public void deveRetornarZeroSeCarrinhoVazio() {
        assertEquals(0.0, carrinhoBuilder.cria().maiorValor(), 0.0001);
    }
    
    @Test
    public void deveRetornarValorDoItemSeCarrinhoCom1Elemento() {
        assertEquals(
            900.0, 
            carrinhoBuilder.comItens(900.0).cria().maiorValor(), 
            0.0001
        );
    }
    
    @Test
    public void 
    deveRetornarMaiorValorSeCarrinhoContemMuitosElementos() {
        assertEquals(
            1500.0, 
            carrinhoBuilder.comItens(900.0, 1500.0, 750.0).cria().maiorValor(), 
            0.0001
        );
    }
}
