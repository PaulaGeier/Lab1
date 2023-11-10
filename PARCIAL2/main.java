package PARCIAL2;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        while (true) {

            ArrayList<ArrayList<Character>> matrixDNA = new ArrayList<>();

            // Llenar matriz con secuencia de ADN
            int filledLines = 0;
            Scanner scanner = new Scanner(System.in);

            while (filledLines < 6) {
                System.out.print("Ingresar secuencia de DNA: ");
                String dna = scanner.nextLine().toUpperCase();

                if (Funciones.checkLetters(dna)) {
                    ArrayList<Character> row = new ArrayList<>();
                    for (char letter : dna.toCharArray()) {
                        row.add(letter);
                    }
                    matrixDNA.add(row);
                    filledLines++;

                    for (ArrayList<Character> r : matrixDNA) {
                        System.out.println(r);
                    }
                } else {
                    System.out.println("INCORRECTO. Debe ingresar las letras A, C, G o T y deben ser 6 letras.");
                }
            }
            System.out.println("------------------------------");

            // Imprimir secuencia de ADN
            System.out.println("ADN DEL HUMANO");
            for (ArrayList<Character> row : matrixDNA) {
                System.out.println(row);
            }
            System.out.println("------------------------------");

            // Verificar si es mutante
            if (Funciones.isMutant(matrixDNA)) {
                System.out.println("ES MUTANTE!");
            } else {
                System.out.println("NO ES MUTANTE!");
            }

            // Salida
            System.out.print("Para ingresar otro ADN ingrese 0, sino ingrese cualquier otro valor: ");
            String exit = scanner.nextLine();

            if (!exit.equals("0")) {
                System.out.println("BYE BYE!");
                break;
            }
        }
    }
}
