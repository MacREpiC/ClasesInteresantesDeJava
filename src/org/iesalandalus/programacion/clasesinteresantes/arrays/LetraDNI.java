package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

import javax.naming.OperationNotSupportedException;

public class LetraDNI {
    public static void main(String[] args) {
        String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKE";
        int dni = 0;
        while (dni < 1 || dni > 99999999) {
            System.out.print("Dime el número de tu DNI: ");
            dni = Entrada.entero();
        }
        System.out.printf("La letra de tu DNI es la: " + letrasDni.charAt(dni % 23));
    }
}