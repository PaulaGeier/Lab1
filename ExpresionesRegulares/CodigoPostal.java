package ExpresionesRegulares;
import java.util.Scanner;
public class CodigoPostal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Ingresar DNI:");
            String dni=sc.nextLine();
            if (validarCodigoPostal(dni)==true){
                System.out.println("Codigo postal valido");
                break;
            }else{
                System.out.println("Codigo postal no valido");
            }
        }
    }
    public static boolean validarCodigoPostal(String codigoPostal){
        return codigoPostal.matches("\\d{4}");
    }
}
