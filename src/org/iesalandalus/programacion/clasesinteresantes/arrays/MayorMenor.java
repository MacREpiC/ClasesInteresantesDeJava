package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class MayorMenor {
    public static void main(String[] args) {
        int numero = 0;
        int nMayor = 0;
        while(numero < 2) {
            System.out.print("Dime un número que sea mayor o igual que dos: ");
            numero = Entrada.entero();
        }
        int[] miArray;
        miArray = new int[numero];
        for(int i = 0; i < miArray.length; i++){
            miArray[i] = (int) (Math.random() * 1001);
        }
        for(int i = 0; i < miArray.length; i++){
            if (miArray[i] > nMayor){
                nMayor = miArray[i];
            }
        }
        for(int i = 0; i < miArray.length; i++){
            System.out.print(miArray[i] + " ");
        }
        System.out.println("El número mayor es: " + nMayor);
    }
}
