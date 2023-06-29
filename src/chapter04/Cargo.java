package chapter04;

import chapter07.DezOuVintePorCento;
import chapter07.QuinzeOuVinteCincoPorCento;
import chapter07.RegraDeCalculo;

public enum Cargo {
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCento()),
    TESTADOR(new QuinzeOuVinteCincoPorCento());
    
    
    private final RegraDeCalculo regra;
    
    Cargo(RegraDeCalculo regra) {
        this.regra = regra;
    }

    public RegraDeCalculo getRegra() {
        return regra;
    }
}
