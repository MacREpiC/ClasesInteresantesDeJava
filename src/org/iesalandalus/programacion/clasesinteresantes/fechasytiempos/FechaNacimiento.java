package org.iesalandalus.programacion.clasesinteresantes.fechasytiempos;
import org.iesalandalus.programacion.utilidades.Entrada;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class FechaNacimiento {
    public static void main(String[] args) {
        DateTimeFormatter formatoLargo = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter diaSemana = DateTimeFormatter.ofPattern("cccc");
        LocalDate hoy = LocalDate.now();
        String fechaNac;
        LocalDate fecha;
        do{
            System.out.print("Dime tu fecha de nacimiento: ");
            fechaNac = Entrada.cadena();
            try {
                fecha = LocalDate.parse(fechaNac, formatoLargo);
            } catch (DateTimeParseException e) {
                System.out.println("Fecha no válida. Inténtalo de nuevo.");
                fecha = null;
            }
        }while(fecha == null);
        System.out.println("Tu fecha de nacimiento es: " + fecha);
        System.out.println("El día de la semana que era tu cumpleaños era el " + fecha.format(diaSemana));
        System.out.println("Faltan " + (fecha.getDayOfYear() - LocalDate.now().getDayOfYear()) + " días hasta tu próximo cumpleaños.");
        if(fecha.getDayOfYear() == LocalDate.now().getDayOfYear() && fecha.getMonthValue() == LocalDate.now().getMonthValue()){
            System.out.println("Felicidades! Es tú cumpleaños y cumples " + (LocalDate.now().getYear() - fecha.getYear()) + " años.");
        }
    }
}
