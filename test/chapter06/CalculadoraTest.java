package chapter06;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculadoraTest {
    @Test
    public void deveSomarUmMaisUm() {
        assertEquals(2, new Calculadora().soma(1, 1));
    }
    
    @Test
    public void deveSomarUmMaisDois() {
        assertEquals(3, new Calculadora().soma(1, 2));
    }
    
    @Test
    public void deveSomarDoisMaisDois() {
        assertEquals(4, new Calculadora().soma(2, 2));
    }
}
