package TRABAJOSPRACTICOS.TrabajoPractico12;
import java.util.ArrayList;
import java.util.Arrays;

public class ValidacionesExpresionesRegulares {

    public static void main(String[] args) {
        // Comprobar si el String cadena no acaba con un dígito.
        System.out.println("Comprobar si el String cadena no acaba con un dígito:");
        System.out.println("Paula: " + noAcabaConDigito("Paula"));
        System.out.println("Payaso*: " + noAcabaConDigito("Payaso*"));
        System.out.println("1234: " + noAcabaConDigito("1234"));
        System.out.println("Colon325: " + noAcabaConDigito("Colon325"));

        // Comprobar si el String cadena no empieza por un dígito.
        System.out.println("\nComprobar si el String cadena no empieza por un dígito:");
        System.out.println("Paula Geier: " + noEmpiezaPorDigito("Paula"));
        System.out.println("Payaso*: " + noEmpiezaPorDigito("Payaso*"));
        System.out.println("-Serena: " + noEmpiezaPorDigito("-Serena"));
        System.out.println("1234: " + noEmpiezaPorDigito("1234"));
        System.out.println("Colon325: " + noEmpiezaPorDigito("Colon325"));
        System.out.println("5 Naranjas: " + noEmpiezaPorDigito("5 Naranjas"));

        // Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
        System.out.println("\nComprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10:");
        System.out.println("Paula GEIER: " + longitudEntre5Y10("Paula"));
        System.out.println("PERRO: " + longitudEntre5Y10("PERRO"));
        System.out.println("verano: " + longitudEntre5Y10("verano"));
        System.out.println("sol: " + longitudEntre5Y10("sol"));

        // Validar el ingreso de un DNI (xx-xxx-xxx).
        System.out.println("\nValidar el ingreso de un DNI (xx-xxx-xxx):");
        System.out.println("44-593-085: " + validarDNI("44-593-085"));
        System.out.println("44-593-05: " + validarDNI("44-593-05"));
        System.out.println("44593085: " + validarDNI("44593085"));

        // Validar y guardar en un ArrayList una serie de mails.
        System.out.println("\nValidar mail:");
        ArrayList<String> correos = new ArrayList<String>(Arrays.asList("paulageier@mail.com", "rodrigozapata@mail.com", "thomasmuñoz@mail.com", "vacalola@mail.", "lospalmeras@mail.com.ar"));
        for (String correo : correos) {
            System.out.println(correo + ": " + validarMail(correo));
        }

        // Comprobar si el String cadena contiene "abc".
        System.out.println("\nComprobar si el String cadena contiene 'abc':");
        System.out.println("banco: " + contieneABC("banco"));
        System.out.println("bencida: " + contieneABC("bencida"));
        System.out.println("vaso: " + contieneABC("vaso"));
        System.out.println("carton: " + contieneABC("carton"));
    }

    // Comprobar si el String cadena no acaba con un dígito.
    public static boolean noAcabaConDigito(String palabra) {
        return !palabra.matches("^.*\\s*\\d$");
    }

    // Comprobar si el String cadena no empieza por un dígito.
    public static boolean noEmpiezaPorDigito(String palabra) {
        return palabra.matches("^[^0-9].*$");
    }

    // Comprobar si el String cadena está formado por un mínimo de 5 letras mayúsculas o minúsculas y un máximo de 10.
    public static boolean longitudEntre5Y10(String palabra) {
        return palabra.matches("^([a-zA-Z\\s]){5,10}$");
    }

    // Validar el ingreso de un DNI (xx-xxx-xxx).
    public static boolean validarDNI(String palabra) {
        return palabra.matches("^\\d{2}-\\d{3}-\\d{3}$");
    }

    // Validar y guardar en un ArrayList una serie de mails.
    public static boolean validarMail(String palabra) {
        return palabra.matches("^.+@{1}.*\\.com{1}.?[a-z]*$");
    }

    // Comprobar si el String cadena contiene "abc".
    public static boolean contieneABC(String palabra) {
        return palabra.matches("^(?=.*a)(?=.*b)(?=.*c).*$");
    }
}
