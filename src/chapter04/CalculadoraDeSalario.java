package chapter04;


public class CalculadoraDeSalario {
    
    public double calculaSalario(Funcionario funcionario) {
        return funcionario
            .getCargo()
            .getRegra()
            .calcula(funcionario);
    }
}
