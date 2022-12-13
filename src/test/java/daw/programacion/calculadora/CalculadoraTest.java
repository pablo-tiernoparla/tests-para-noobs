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
}
