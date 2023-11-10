package ExpresionesRegulares;
import java.util.Scanner;
public class CorreoElectronico {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar mail:");
        String mail=sc.nextLine();
        if (validarMail(mail)==true){
            System.out.println("Mail valido");
        }else{
            System.out.println("Mail no valido");
        }
    }
    public static boolean validarMail(String mail) {
        return mail.matches("^.+@{1}.*\\.com{1}.?[a-z]*$");
    }
}
