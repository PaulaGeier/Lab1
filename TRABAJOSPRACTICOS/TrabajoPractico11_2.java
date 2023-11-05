package TRABAJOSPRACTICOS;
import java.util.ArrayList;
import java.util.Random;
public class TrabajoPractico11_2 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();

        //Llenar array con numeros aleatorios
        for (int i = 0; i < 20; i++) {
            int numero = random.nextInt(100);
            if (numero % 2 == 0) {
                numerosAleatorios.add(numero);
            }else{
                i--;
            }
        }
        System.out.println("ARRAY:"+numerosAleatorios);

        //Sacar promedio aritmetrico
        int suma=0;
        for(int i=0;i<numerosAleatorios.size();i++){
            suma+=numerosAleatorios.get(i);
        }
        int promedio=suma/20;
        System.out.println("PROMEDIO:"+promedio);

        //Numeros del array iguales al promedio
        int igualesAlPromedio=0;
        for (int i=0;i<20;i++){
            if (numerosAleatorios.get(i)==promedio){
                igualesAlPromedio+=1;
            }
        }
        System.out.println("NUMEROS DEL ARRAY IGUALES AL PROMEDIO:"+ igualesAlPromedio);

        //Numeros del array mayores al promedio
        int mayoresAlPromedio=0;
        for (int i=0;i<20;i++){
            if (numerosAleatorios.get(i)>promedio){
                mayoresAlPromedio+=1;
            }
        }
        System.out.println("NUMEROS DEL ARRAY MAYORES AL PROMEDIO:"+mayoresAlPromedio);

        //Numeros del array menores al promedio

        int menoresAlPromedio=0;
        for (int i=0;i<20;i++){
            if (numerosAleatorios.get(i)<promedio){
                menoresAlPromedio+=1;
            }
        }
        System.out.println("NUMEROS DEL ARRAY MENORES AL PROMEDIO:"+menoresAlPromedio);

    }

}
