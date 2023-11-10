package PARCIAL2;

import java.util.ArrayList;

public class Funciones {

    public static boolean checkLetters(String word) {
        int ax = 0;
        for (char i : word.toCharArray()) {
            if (i != 'A' && i != 'C' && i != 'G' && i != 'T') {
                ax++;
            }
        }
        return ax == 0 && word.length() == 6;
    }

    //-----------------------------------------
    public static int repeatedDNA(ArrayList<Character> dnaChain) {
        int counter = 1;
        for (int i = 1; i < dnaChain.size(); i++) {
            if (dnaChain.get(i).equals(dnaChain.get(i - 1)) && counter < 4) {
                counter++;
            } else if (counter == 4) {
                break;
            } else {
                counter = 1;
            }
        }
        return counter;
    }

    //-------------------------------------------
    public static boolean isMutant(ArrayList<ArrayList<Character>> dna) {

        // DIAGONALES IZQUIERDAS

        // DIAGONAL PRINCIPAL
        ArrayList<Character> dnaChain = new ArrayList<>();
        for (int i = 0; i < dna.size(); i++) {
            for (int j = 0; j < dna.get(i).size(); j++) {
                if (i == j) {
                    dnaChain.add(dna.get(i).get(j));
                }
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //DIAGONAL DE LA POSICION 1,0
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            for (int j = 0; j < dna.get(i).size(); j++) {
                if (i == j + 1) {
                    dnaChain.add(dna.get(i).get(j));
                }
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //DIAGONAL DE LA POSICION 0,1
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            for (int j = 0; j < dna.get(i).size(); j++) {
                if (i == j - 1) {
                    dnaChain.add(dna.get(i).get(j));
                }
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }


        //DIAGONAL DE LA POSICION 2,0
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            for (int j = 0; j < dna.get(i).size(); j++) {
                if (i == j + 2) {
                    dnaChain.add(dna.get(i).get(j));
                }
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //DIAGONAL DE LA POSICION 0,2
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            for (int j = 0; j < dna.get(i).size(); j++) {
                if (i == j - 2) {
                    dnaChain.add(dna.get(i).get(j));
                }
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //----------
        //DIAGONALES DERECHAS

        //DIAGONAL SECUNDARIO
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            dnaChain.add(dna.get(i).get(5 - i));
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        // DIAGONAL DE LA POSICION 0,4
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            if (i <= 4) {
                dnaChain.add(dna.get(i).get(4 - i));
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //DIAGONAL DE LA POSICION 0,3
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            if (i <= 3) {
                dnaChain.add(dna.get(i).get(3 - i));
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //DIAGONAL DE LA POSICION 1,5
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            if (i > 0) {
                dnaChain.add(dna.get(i).get(6 - i));
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //DIAGONAL DE LA POSICION 2,5
        dnaChain.clear();
        for (int i = 0; i < dna.size(); i++) {
            if (i > 1) {
                dnaChain.add(dna.get(i).get(7 - i));
            }
        }
        if (repeatedDNA(dnaChain) == 4) {
            return true;
        }

        //------------
        //FILAS
        dnaChain.clear();
        int row = 0;
        while (row < 6) {
            for (int j = 0; j < dna.get(row).size(); j++) {
                dnaChain.add(dna.get(row).get(j));
            }
            if (repeatedDNA(dnaChain) == 4) {
                return true;
            } else {
                row++;
            }
        }

        //COLUMNAS
        dnaChain.clear();
        int column = 0;
        while (column < 6) {
            for (int i = 0; i < dna.size(); i++) {
                dnaChain.add(dna.get(i).get(column));
            }
            if (repeatedDNA(dnaChain) == 4) {
                return true;
            } else {
                column++;
            }
        }
        //si no se encuentra ninguna secuencia se retorna Falso
        return false;
    }

}
