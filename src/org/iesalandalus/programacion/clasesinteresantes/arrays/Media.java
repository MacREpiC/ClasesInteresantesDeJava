package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Media {
    public static void main(String[] args) {
        int numero = 0;
        while(numero < 2) {
            System.out.print("Dime un número que sea mayor o igual que dos: ");
            numero = Entrada.entero();
        }
    }
}
