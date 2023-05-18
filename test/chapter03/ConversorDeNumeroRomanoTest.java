package chapter03;

import org.junit.Test;
import static org.junit.Assert.*;

public class ConversorDeNumeroRomanoTest {
    
    @Test
    public void deveEntenderOSimboloI() {
        // Arrange
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        // Act
        int numero = romano.converte("I");

        // Assert
        assertEquals(1, numero);
    }
    
    @Test
    public void deveEntenderOSimboloV() {
        // Arrange
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
    
        // Act
        int numero = romano.converte("V");

        // Assert
        assertEquals(5, numero);
    }
    
    // TODO X
    
    // TODO L
    
    // TODO C
    
    // TODO D
    
    // TODO M
}
