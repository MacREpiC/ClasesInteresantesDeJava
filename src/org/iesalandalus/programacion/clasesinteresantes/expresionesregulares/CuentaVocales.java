package org.iesalandalus.programacion.clasesinteresantes.expresionesregulares;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CuentaVocales {
    public static final String ER_VOCALES = "([aeiouáéíóúÁÉÍÓÚAEIOU]+)";

    public static void main(String[] args) {
        Pattern patron;
        Matcher comparador;
        int vocalesContadas = 0;

        System.out.print("Dame un texto: ");
        String texto = Entrada.cadena();

        patron = Pattern.compile(ER_VOCALES);
        comparador = patron.matcher(texto);
        while (comparador.find()) {
            vocalesContadas++;
        }
        System.out.println("Vocales contadas: " + vocalesContadas);
    }
}
