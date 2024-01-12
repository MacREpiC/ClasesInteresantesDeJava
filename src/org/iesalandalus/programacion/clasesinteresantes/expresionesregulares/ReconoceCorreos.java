package org.iesalandalus.programacion.clasesinteresantes.expresionesregulares;

import org.iesalandalus.programacion.utilidades.Entrada;

import javax.xml.stream.events.EntityReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReconoceCorreos {
    public static final String ER_CORREO = "([a-z0-9]+@[a-z0-9]+\\.[a-z0-9]+)";

    public static void main(String[] args) {
        Pattern patron;
        Matcher comparador;

        System.out.print("Dame un texto que tenga correos: ");
        String texto = Entrada.cadena();

        patron = Pattern.compile(ER_CORREO);
        comparador = patron.matcher(texto);
        while (comparador.find()) {
            System.out.printf("Correo reconocido: %s%n", comparador.group());
        }
    }
}
