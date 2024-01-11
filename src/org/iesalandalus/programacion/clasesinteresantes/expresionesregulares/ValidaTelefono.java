package org.iesalandalus.programacion.clasesinteresantes.expresionesregulares;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaTelefono {
    public static final String ER_TLF = "(\\d{9})";

    public static void main(String[] args) {
        String telefono;
        Pattern patron;
        Matcher comparador;

        patron = Pattern.compile(ER_TLF);
        do {
            System.out.print("Introduce un teléfono: ");
            telefono = Entrada.cadena();
            comparador = patron.matcher(telefono);
        } while (!comparador.matches());
    }
}
