package org.iesalandalus.programacion.clasesinteresantes.fechasytiempos;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Horas {
    public static void main(String[] args) {
        LocalTime ahora = LocalTime.now();
        System.out.println("Son las: " + ahora);

        DateTimeFormatter formatoCortoAMPM = DateTimeFormatter.ofPattern("h:m:s");
        DateTimeFormatter formatoLargoAMPM = DateTimeFormatter.ofPattern("hh:mm:ss");
        DateTimeFormatter formatoCorto24h = DateTimeFormatter.ofPattern("H:m:s");
        DateTimeFormatter formatoLargo24h = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter formatoTexto = DateTimeFormatter.ofPattern("h 'horas' m 'minutos' s 'segundos' a");
        System.out.println("La hora actual en formato corto AM/PM se expresa como: " + ahora.format(formatoCortoAMPM));
        System.out.println("La hora actual en formato largo AM/PM se expresa como: " + ahora.format(formatoLargoAMPM));
        System.out.println("La hora actual en formato corto 24h se expresa como: " + ahora.format(formatoCorto24h));
        System.out.println("La hora actual en formato largo 24h se expresa como: " + ahora.format(formatoLargo24h));
        System.out.println("La hora actual expresada en texto es: " + ahora.format(formatoTexto));

        LocalTime medioDia = LocalTime.of(0, 0, 0);
        System.out.println("Media noche: " + medioDia.format(formatoLargoAMPM));

        LocalTime mediaNoche = LocalTime.of(0, 0, 0);
        System.out.println("Media noche: " + mediaNoche.format(formatoLargoAMPM));
    }
}
