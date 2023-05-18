package chapter02;

import org.junit.Test;
import static org.junit.Assert.*;


public class TestaMaiorEMenorTest {    
    
    @Test
    public void ordemDecrescente() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
        MaiorEMenor algoritmo = new MaiorEMenor();
        
        algoritmo.encontra(carrinho);
        
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Geladeira", algoritmo.getMaior().getNome());
    }
    
    @Test
    public void ordemCrescente() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        MaiorEMenor algoritmo = new MaiorEMenor();
        
        algoritmo.encontra(carrinho);
        
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Geladeira", algoritmo.getMaior().getNome());
    }
    
    @Test
    public void ordemVariada() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Geladeira", 450.0));
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
        carrinho.adiciona(new Produto("Liquidificador", 250.0));
        MaiorEMenor algoritmo = new MaiorEMenor();
        
        algoritmo.encontra(carrinho);
        
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Geladeira", algoritmo.getMaior().getNome());
    }
    
    @Test
    public void umUnicoProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(new Produto("Jogo de Pratos", 70.0));
        MaiorEMenor algoritmo = new MaiorEMenor();
        
        algoritmo.encontra(carrinho);
        
        assertEquals("Jogo de Pratos", algoritmo.getMenor().getNome());
        assertEquals("Jogo de Pratos", algoritmo.getMaior().getNome());
    }
    
    @Test
    public void carrinhoVazio() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        MaiorEMenor algoritmo = new MaiorEMenor();
        
        algoritmo.encontra(carrinho);
        
        assertNull( algoritmo.getMenor());
        assertNull( algoritmo.getMaior());
    }
}
