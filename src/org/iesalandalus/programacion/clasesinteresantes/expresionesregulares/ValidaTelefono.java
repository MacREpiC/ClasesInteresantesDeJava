package org.iesalandalus.programacion.clasesinteresantes.expresionesregulares;

import org.iesalandalus.programacion.utilidades.Entrada;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaTelefono {
    public static final String ER_TLF = "(\\d{9})";

    public static void main(String[] args) {
        String tlf;
        do{
            System.out.print("Dime tu número de teléfono: ");
            tlf = Entrada.cadena();
        } while (!tlf.matches("(\\d{9})"));
    }
}
