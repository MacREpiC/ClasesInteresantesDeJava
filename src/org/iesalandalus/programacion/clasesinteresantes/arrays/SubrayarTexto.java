package org.iesalandalus.programacion.clasesinteresantes.arrays;

import org.iesalandalus.programacion.utilidades.Entrada;

public class SubrayarTexto {
    public static String subrayar(String texto){
        String subrayado = String.format("%%0%dd", texto.length());
        subrayado = String.format(subrayado, 0).replace('0','-');
        return String.format("%s%n%s", texto, subrayado);
    };
    public static void main(String[] args) {
        System.out.print("Dime un nombre: ");
        String nombre = Entrada.cadena();
        System.out.println(subrayar(nombre));
    }
}
