package chapter03;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorDeNumeroRomanoTest {
    
    @Test
    public void deveEntenderOSimboloI() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        int numero = romano.converte("I");

        assertEquals(1, numero);
    }
    
    @Test
    public void deveEntenderOSimboloV() {        
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        int numero = romano.converte("V");

        assertEquals(5, numero);
    }
    
    @Test
    public void deveEntenderOSimboloX() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        int numero = romano.converte("X");

        assertEquals(10, numero);
    }
    
    @Test
    public void deveEntenderOSimboloL() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        int numero = romano.converte("L");

        assertEquals(50, numero);
    }
    
    @Test
    public void deveEntenderOSimboloC() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        int numero = romano.converte("C");

        assertEquals(100, numero);
    }
    
    @Test
    public void deveEntenderOSimboloD() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        int numero = romano.converte("D");

        assertEquals(500, numero);
    }
    
    @Test
    public void deveEntenderOSimboloM() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        int numero = romano.converte("M");

        assertEquals(1000, numero);
    }

}
