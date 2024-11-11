import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe una función que reciba dos palabras (String) y retorne
         * verdadero o falso (Bool) según sean o no anagramas.
         * - Un Anagrama consiste en formar una palabra reordenando TODAS
         *   las letras de otra palabra inicial.
         * - NO hace falta comprobar que ambas palabras existan.
         * - Dos palabras exactamente iguales no son anagrama.
         */
        //Definición de variables
        Scanner sc = new Scanner(System.in);
        String palabra1 = "";
        String palabra2 = "";
        boolean resultado = false;

        //Algoritmo
        try {
            System.out.println("Introduce la primera palabra: ");
            palabra1 = sc.nextLine();
            System.out.println("Introduce la segunda palabra: ");
            palabra2 = sc.nextLine();
            resultado = sonAnagramas(palabra1, palabra2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        if (resultado) {
            System.out.println("Son anagramas");
        } else {
            System.out.println("No son anagramas");
        }

    }

    public static boolean sonAnagramas(String a, String b) throws Exception {
        if (a.length() != b.length()) {
            throw new Exception("Error: Deben coincidir el numero de letras");
        }
        if (a.equals(b)) {
            throw new Exception("Error: No pueden ser la misma palabra");
        }

        int coincidencias = 0;
        for (int i = 0; i < a.length(); i++) {
            if (b.indexOf(a.charAt(i)) >= 0) {
                coincidencias++;
            }
        }
        return (coincidencias == a.length());
    }
}