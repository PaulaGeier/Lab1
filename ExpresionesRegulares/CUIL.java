package ExpresionesRegulares;
import java.util.Scanner;
public class CUIL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar numero de cuil:");
        String cuil=sc.nextLine();
        if (validarCUIL(cuil)==true){
            System.out.println("CUIL valido");
        }else{
            System.out.println("CUIL no valido");
        }
    }
    public static boolean validarCUIL(String cuil){
        return cuil.matches("\\d{11}");
    }
}
