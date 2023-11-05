package TRABAJOSPRACTICOS;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TrabajoPractico9 {
    public static void main (String [] args) {
        //Ejercicio 1
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        //Añadir 5 elementos
        numeros.add(5);
        numeros.add(6);
        numeros.add(10);
        numeros.add(3);
        numeros.add(6);


        //Ejercicio 2
        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("Rodrigo");
        nombres.add("Thomas");
        nombres.add("Ruth");


        //Ejercicio 3
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 40));
        System.out.println(nums);




        //Ejercicio 4
        ArrayList<String> palabras = new ArrayList<String>(Arrays.asList("hola", "chau", "mañana", "hoy"));
        System.out.println("La longitud del array es : " + palabras.size());


        //Ejercicio 5
        ArrayList<String> lista = new ArrayList<>();




        lista.add("Manzana");
        lista.add("Platano");
        lista.add("Maracuya");
        lista.add("Banana");
        lista.remove("Manzana");
        System.out.println(lista);


        //Ejercicio 6
        ArrayList<Integer> empty = new ArrayList<Integer>();
        if (empty.isEmpty()) {
            System.out.println("El array está vacio");
        } else {
            System.out.println("El array no está vacío");
        }




        //Ejercicio 7
        ArrayList<Integer> lista2 = new ArrayList<>(Arrays.asList(100, 2, 3, 4));


        int mayor = lista2.get(0);
        for (int item : lista2) {
            if (item > mayor) {
                mayor = item;
            }
        }
        System.out.println(mayor);




        //Ejercicio 8
        ArrayList<Integer> original = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> copia = new ArrayList<Integer>();
        for (Integer i : original) {
            copia.add(i);
        }
        System.out.println(copia);




        //Ejercicio 9
        ArrayList<Integer> aInv = new ArrayList<>(Arrays.asList(9, 6, 3, 8, 5, 2, 7, 4, 1));
        Integer add;
        for (int i = aInv.size() - 1; i >= 0; i--) {
            add = aInv.get(i);
            aInv.remove(i);
            aInv.add(add);
        }
        System.out.println(aInv);




        //Ejercicio 10
        ArrayList<Integer> lista3 = new ArrayList<>(Arrays.asList(100, 2, 3, 4));
        ArrayList<Integer> lista4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 70, 0));
        for (int item : lista3) {
            lista4.add(item);
        }
        Collections.sort(lista4);
        System.out.println(lista4);


        //Ejercicio 11
        ArrayList<Integer> numeros5 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 4, 8, 7));
        int recorrer = numeros5.size();
        for (int i = 0; i < recorrer; i++) {
            if (numeros5.get(i) % 2 == 0) {
                numeros5.remove(i);
                recorrer-=1;
                i--;
            }
        }
        System.out.println(numeros);


        //Ejercicio 12
        ArrayList<String> lista7 = new ArrayList<>(Arrays.asList("Hola","Fresa","Cacao","Banana"));
        int busquedaIndice = lista7.indexOf("Bobo");
        if(busquedaIndice != -1){
            System.out.println("El indice de la palabra es: " + busquedaIndice);
        }else{
            System.out.println("El elemento no existe en el indice");
        }




        //Ejercicio 13
        ArrayList<Integer> same = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        ArrayList<Integer> isSame = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        int check = 0;
        for (Integer i = 0; i < same.size(); i++) {
            if (isSame.get(i) == same.get(i)) {
                check += 1;
            }
        }
        if (check == same.size()) {
            System.out.println("Las listas son iguales");
        } else {
            System.out.println("Las listas no son iguales");
        }


        //Ejercicio 14
        ArrayList<Integer> searchMenor = new ArrayList<>(Arrays.asList(4444, 5, 69, 8, -500));
        int menor = searchMenor.get(0);
        for (int i : searchMenor) {
            if (i < menor) {
                menor = i;
            }
        }
        System.out.println("El menor número del array es: " + menor);


        //Ejercicio 15
        ArrayList<Integer> sumArray = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 56, 7, 89));
        int sum = 0;
        for (int i : sumArray) {
            sum += i;
        }
        System.out.println("La suma de los números de array es: " + sum);




        //Ejercicio 16
        ArrayList<String> lista5 = new ArrayList<>(Arrays.asList("Hola","Fresa","Cacao","Banana"));




        String sumaString = "";
        for(String item : lista5){
            sumaString += item;
        }
        System.out.println(sumaString);




        //Ejercicio 17
        ArrayList<String> lista6 = new ArrayList<>(Arrays.asList("Hola","Hola"));




        for(String item : lista6){
            if(lista.indexOf(item) != lista.lastIndexOf(item)){
                lista6.remove(lista6.lastIndexOf(item));
            }




        }
        System.out.println(lista6);




        //Ejercicio 18
        ArrayList<Integer> oddArrray = new ArrayList<>(Arrays.asList(1, 5, 8, 6, 2, 7, 1, 1, 8));
        int oddSum = 0;
        for (int i = 0; i < oddArrray.size(); i += 2) {
            oddSum += oddArrray.get(i);
        }
        System.out.println("La suma de los indices pares del array es: " + oddSum);




        //Ejercicio 19
        ArrayList<Integer> numeros2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 5, 4, 8, 7));
        int numero = 8;
        boolean encontrado = false;
        for (int i = 0; i < numeros2.size(); i++) {
            if (numeros2.get(i) == numero) {
                encontrado = true;
            }
        }
        if (encontrado == true) {
            System.out.println("Numero encontrado: "+8);
        }else {
            System.out.println("Numero no encontrado");
        }
        //Ejercicio 20
        ArrayList<String> strArray = new ArrayList<>(Arrays.asList("a", "queso", "hamburguesa", "galleta", "Rodrigo"));
        String larger = "";
        for (String word : strArray) {
            if (word.length() > larger.length()) {
                larger = word;
            }
        }
        System.out.println("La palabra mas larga del array es: " + larger);




        //Ejercicio 21
        ArrayList<Integer> enterosSinPromediar = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int preProm = 0, cant = enterosSinPromediar.size(), result = 0;
        for (int i : enterosSinPromediar) {
            preProm += i;
        }
        result = preProm / cant;
        System.out.println("El promedio del array es: " + result);




        //Ejercicio 22
        ArrayList<Integer> toOrder = new ArrayList<>(Arrays.asList(9, 8, 7, 6, 5, 4, 3, 2, 1, 0));
        Collections.sort(toOrder);


        System.out.println(toOrder);




        //Ejercicio 23
        ArrayList<Integer> toRomove = new ArrayList<>(Arrays.asList(15, 48, 32, 64, 79, 12, 54, 451, 50, 20, 21, 1, 6, 58));


        int i = 0;
        while (i < toRomove.size()) {
            if (toRomove.get(i) >= 50) {
                toRomove.remove(i);
            } else {
                i++;
            }
        }
        System.out.println(toRomove);



        //Ejercicio 24
        ArrayList<String> repeatArray = new ArrayList<>(Arrays.asList("a", "b", "a", "uva", "uva", "manzana", "uva"));
        String search = "uva";
        int count = 0;
        for (String j : repeatArray){
            if (j.equals(search)){
                count += 1;
            }
        }
        System.out.println("El elemento (" + search + ") Se repite " + count + " veces");



        //Ejercicio 25
        ArrayList<String> cadenasToOrder = new ArrayList<>(Arrays.asList("lengua", "manzana", "vacío", "molleja", "bicep", "pechuga", "arcoiris"));

        Collections.sort(cadenasToOrder);
        System.out.println(cadenasToOrder);
    }
}

