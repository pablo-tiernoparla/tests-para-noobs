package daw.programacion.calculadora;

import static org.junit.Assert.*;
import org.junit.Test;

public class CalculadoraTest {
    
    @Test
    public void dosSumarDosEsCuatro(){
        int expected = 4;
        int num1 = 2, num2 = 2;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.sumar(num1, num2));
    }

    @Test
    public void cincoSumarSieteEsDoce(){
        int expected = 12;
        int num1 = 5, num2 = 7;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.sumar(num1, num2));
    }

    @Test
    public void tresSumarSieteEsDiez(){
        int expected = 10;
        int num1 = 3, num2 = 7;
        Calculadora calc = new Calculadora();

        assertTrue("Tres mas siete deberia ser 10", expected == 
        calc.sumar(num1, num2));
    }

    @Test
    public void tresSumarSieteNoEsCien(){
        int expected = 100;
        int num1 = 3, num2 = 7;
        Calculadora calc = new Calculadora();

        assertFalse("Tres mas siete no deberia ser 100", expected == 
        calc.sumar(num1, num2));
    }

    @Test
    public void sieteMenosCincoEsDos(){
        int expected = 2;
        int num1 = 7, num2 = 5;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.restar(num1, num2));
    }

    @Test
    public void sietePorCincoEsTreintaCinco(){
        int expected = 35;
        int num1 = 7, num2 = 5;
        Calculadora calc = new Calculadora();

        assertEquals(expected, calc.multiplicar(num1, num2));
    }
}
