package ExpresionesRegulares;

import java.util.Scanner;
public class Telefono {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar numero de telefono:");
        String numero=sc.nextLine();
        if (validarTelefono(numero)==true){
            System.out.println("Numero valido");
        }else{
            System.out.println("Numero no valido");
        }
    }
    public static boolean validarTelefono(String numero){
        return numero.matches("\\d{7,10}");
    }
}
