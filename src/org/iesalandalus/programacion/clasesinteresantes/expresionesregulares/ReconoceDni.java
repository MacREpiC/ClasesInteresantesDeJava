package org.iesalandalus.programacion.clasesinteresantes.expresionesregulares;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReconoceDni {
    public static final String ER_DNI = "(\\d{8})([A-Z])";
    public static void main(String[] args) {
        String dni;
        Pattern patron;
        Matcher comparador;

        patron = Pattern.compile(ER_DNI);
        do {
            System.out.print("Introduce un DNI: ");
            dni = Entrada.cadena();
            comparador = patron.matcher(dni);
        } while (!comparador.matches());

        System.out.printf("Número: %s%n", comparador.group(1));
        System.out.printf("Letra del DNI es la: %s%n", comparador.group(2));
    }
}
