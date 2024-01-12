package org.iesalandalus.programacion.clasesinteresantes.expresionesregulares;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaPalabras {
    public static final String ER_PALABRAS = "([a-zA-ZáéíóúÁÉÍÓÚ])";

    public static void main(String[] args) {
        Pattern patron;
        Matcher comparador;
        int palabrasReconocidas = 0;

        System.out.print("Dame un texto: ");
        String texto = Entrada.cadena();

        patron = Pattern.compile(ER_PALABRAS);
        comparador = patron.matcher(texto);
        while (comparador.find()) {
            palabrasReconocidas++;
        }
        System.out.println("Palabras reconocidas: " + palabrasReconocidas);
    }
}
