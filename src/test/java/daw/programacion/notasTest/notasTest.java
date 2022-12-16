package daw.programacion.notasTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import daw.programacion.notas.notas;

public class notasTest {
    
    @Test
    public void notaNegativaError(){
        String expected = "invalido";
        double notaSacada = -5.4;
        notas notas = new notas();
        assertEquals(expected, notas.notaTexto(notaSacada));
    }
}
