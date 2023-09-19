import java.util.Scanner;

public class programaA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num= sc.nextInt();
        System.out.println("Ingrese otro numero:");
        int num2=sc.nextInt();
        int resto1=num%10;
        int resto2=num2%10;
        if (resto1==resto2){
            System.out.println("Las ultimas cifras de ambos numero son iguales");
        }else{
            System.out.println("Las ultimas cifras de ambos numeros NO son iguales");
        }
    }
}