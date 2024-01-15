package org.iesalandalus.programacion.clasesinteresantes.fechasytiempos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fechas {
    public static void main(String[] args) {
        LocalDate hoy = LocalDate.now();
        System.out.println("La fecha de hoy es: " + hoy); //Imprime la fecha de hoy, aunque en formato inglés

        DateTimeFormatter formatoCorto = DateTimeFormatter.ofPattern("d/M/yy");
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatoTextoCorto = DateTimeFormatter.ofPattern("ccc, d 'de' MMM 'de' yyyy");
        DateTimeFormatter formatoTextoLargo = DateTimeFormatter.ofPattern("cccc, d 'de' MMMM 'de' yyyy");
        System.out.println("La fecha de hoy en formato corto se expresa como: " + hoy.format(formatoCorto));
        System.out.println("La fecha de hoy en formato largo se expresa como: " + hoy.format(formatoLargo));
        System.out.println("La fecha de hoy expresada en texto corto es: " + hoy.format(formatoTextoCorto));
        System.out.println("La fecha de hoy expresada en texto largo es: " + hoy.format(formatoTextoLargo));

        LocalDate anoNuevo = LocalDate.of(2024, 1, 1);
        System.out.println("Año nuevo: " + anoNuevo.format(formatoTextoLargo));

        String liberacionJava8 = "18/12/2004";
        LocalDate fechaLiberacionJava8 = LocalDate.parse(liberacionJava8, formatoLargo);
        System.out.println("Fecha de liberación de Java 8: " + fechaLiberacionJava8.format(formatoTextoLargo));
    }
}
