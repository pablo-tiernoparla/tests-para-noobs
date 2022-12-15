package daw.programacion.notas;

public class notas {
    
    public String notaTexto(double nota){
        String notaEnTexto;

        if(nota < 0 || nota > 10){
            notaEnTexto = "invalido";
        } else if (nota < 5) {
            notaEnTexto = "suspenso";
        } else if (nota < 7) {
            notaEnTexto = "aprobado";
        } else if (nota < 9) {
            notaEnTexto = "notable";
        } else if (nota < 10) {
            notaEnTexto = "sobresaliente";
        } else {
            notaEnTexto = "matricula";
        }

        return notaEnTexto;
    }
}
