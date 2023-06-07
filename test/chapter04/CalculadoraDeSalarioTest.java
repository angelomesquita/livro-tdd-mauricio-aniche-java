package chapter04;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraDeSalarioTest {
    
    
    @Test
    public void 
    deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora = 
            new CalculadoraDeSalario();
        Funcionario desenvolvedor =
            new Funcionario
                ("Mauricio", 1500, Cargo.DESENVOLVEDOR);
        
        double salario = calculadora.calculaSalario(desenvolvedor);
        
        assertEquals(desenvolvedor.getSalario() * 0.9, salario, 0.00001);
    }
    
    @Test
    public void 
    deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
        CalculadoraDeSalario calculadora = 
            new CalculadoraDeSalario();
        Funcionario desenvolvedor =
            new Funcionario
                ("Mauricio", 4000, Cargo.DESENVOLVEDOR);
        
        double salario = calculadora.calculaSalario(desenvolvedor);
        
        assertEquals(desenvolvedor.getSalario() * 0.8, salario, 0.00001);
    }
    
    @Test
    public void
    deveCalcularSalarioParaDBAsComSalarioAbaixoDoLimite() {
        CalculadoraDeSalario calculadora = 
            new CalculadoraDeSalario();
        Funcionario dba =
            new Funcionario
                ("Mauricio", 500, Cargo.DBA);
        
        double salario = calculadora.calculaSalario(dba);
        
        assertEquals(dba.getSalario() * 0.85, salario, 0.00001);
    }
}
