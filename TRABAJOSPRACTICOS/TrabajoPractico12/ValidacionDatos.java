package TRABAJOSPRACTICOS.TrabajoPractico12;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionDatos {

    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("paulageier@mail.com");
        datos.add("123-656-8090");
        datos.add("9876543210");
        datos.add("2023-11-06");
        datos.add("12345");

        for (String dato : datos) {
            if (validarCorreoElectronico(dato)) {
                System.out.println(dato + " es una dirección de correo electrónico válida.");
            } else if (validarNumeroDeTelefono(dato)) {
                System.out.println(dato + " es un número de teléfono válido.");
            } else if (validarFecha(dato)) {
                System.out.println(dato + " es una fecha válida.");
            } else if (validarCodigoPostal(dato)) {
                System.out.println(dato + " es un código postal válido.");
            } else {
                System.out.println(dato + " no es válido.");
            }
        }
    }

    public static boolean validarCorreoElectronico(String correo) {
        // Patrón de validación de dirección de correo electrónico
        String patron = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(correo);
        return matcher.matches();
    }

    public static boolean validarNumeroDeTelefono(String numero) {
        // Patrón de validación de número de teléfono
        String patron = "^[0-9]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(numero);
        return matcher.matches();
    }

    public static boolean validarFecha(String fecha) {
        // Patrón de validación de fecha (formato AAAA-MM-DD)
        String patron = "^[0-9]{4}-[0-9]{2}-[0-9]{2}$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(fecha);
        return matcher.matches();
    }

    public static boolean validarCodigoPostal(String codigoPostal) {
        // Patrón de validación de código postal
        String patron = "^[0-9]+$";
        Pattern pattern = Pattern.compile(patron);
        Matcher matcher = pattern.matcher(codigoPostal);
        return matcher.matches();
    }
}


