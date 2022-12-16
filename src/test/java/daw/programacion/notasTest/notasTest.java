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

    @Test
    public void notaSuperiorDiez(){
        String expected = "invalido";
        double notaSacada = 11.6;
        notas notas = new notas();
        assertEquals(expected, notas.notaTexto(notaSacada));
    }

    @Test
    public void notaSuspensa(){
        String expected = "suspenso";
        double notaSacada = 2.5;
        notas notas = new notas();
        assertEquals(expected, notas.notaTexto(notaSacada));
    }

    @Test
    public void notaAprobada(){
        String expected = "aprobado";
        double notaSacada = 5.4;
        notas notas = new notas();
        assertEquals(expected, notas.notaTexto(notaSacada));
    }

    @Test
    public void notaNotable(){
        String expected = "notable";
        double notaSacada = 8.8;
        notas notas = new notas();
        assertEquals(expected, notas.notaTexto(notaSacada));
    }

    @Test
    public void notaSobresaliente(){
        String expected = "sobresaliente";
        double notaSacada = 9.7;
        notas notas = new notas();
        assertEquals(expected, notas.notaTexto(notaSacada));
    }

    @Test
    public void notaMatricula(){
        String expected = "matricula";
        double notaSacada = 10;
        notas notas = new notas();
        assertEquals(expected, notas.notaTexto(notaSacada));
    }
}
