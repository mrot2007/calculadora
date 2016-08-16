/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marcelo
 */
public class CalculadoraTest {
    Calculadora calc = new Calculadora();
    public CalculadoraTest() {
    }

    /**
     * Test of somar method, of class Calculadora.
     */
    @Test
    public void testSomar() {
         assertEquals(30, calc.somar(10,20), 0);
    }

    /**
     * Test of subtrair method, of class Calculadora.
     */
    @Test
    public void testSubtrair() {
        assertEquals(20, calc.subtrair(50,30), 0);
    }

    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        assertEquals(40, calc.multiplicar(10,4), 0);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        assertEquals(5, calc.dividir(10,2), 0);
    }
    
}
