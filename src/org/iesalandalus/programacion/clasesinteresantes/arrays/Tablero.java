package org.iesalandalus.programacion.clasesinteresantes.arrays;

public class Tablero {
    public static void main(String[] args) {
        char[][] tablero;
        tablero = new char[8][8];
        char negro = 'X';
        char blanco = ' ';
        for (int x = 0; x < tablero.length; x++) {
            for(int y = 0; y < tablero.length; y++) {
                if ((x + y) % 2 == 0) {
                    tablero[x][y] = blanco;
                } else {
                    tablero[x][y] = negro;
                }
            }
        }
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }
}
