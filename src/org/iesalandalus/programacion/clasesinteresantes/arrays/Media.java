package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class Media {
    public static void main(String[] args) {
        int numero = 0;
        int sumaTotal = 0;
        int cMayores = 0;
        int cMenores = 0;
        int igualesMedia = 0;
        while(numero < 3) {
            System.out.print("Dime un número que sea mayor o igual que dos: ");
            numero = Entrada.entero();
        }
        int[] miArray;
        miArray = new int[numero];
        for(int i = 0; i < miArray.length; i++){
            miArray[i] = (int) (Math.random() * 101);
        }
        for(int i = 0; i < miArray.length; i++){
            sumaTotal += miArray[i];
        }
        int media = (int) sumaTotal / numero;
        for(int i = 0; i < miArray.length; i++){
            if(miArray[i] > media){
                cMayores++;
            }
            if(miArray[i] < media){
                cMenores++;
            }
            if(miArray[i] == media){
                igualesMedia++;
            }
        }
        for(int i = 0; i < miArray.length; i++){
            System.out.println(miArray[i] + " ");
        }
        System.out.println("Cantidad de número mayores a la media: " + cMayores);
        System.out.println("Cantidad de número menores a la media: " + cMenores);
        System.out.println("Cantidad de número iguales a la media: " + igualesMedia);
    }
}
