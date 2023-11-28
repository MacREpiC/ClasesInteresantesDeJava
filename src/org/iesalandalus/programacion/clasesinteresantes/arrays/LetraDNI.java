package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class LetraDNI {
    private static final char[] DNI_LETRAS = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

    public static void main(String[] args) {
        int dni = 0;
        while (dni < 1 || dni > 99999999){
            System.out.print("Dime el número de tu DNI: ");
            dni = Entrada.entero();
        }
        System.out.println("La letra de tu DNI es: " + DNI_LETRAS[dni % 23]);
    }
}
