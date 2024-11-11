public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que muestre por consola (con un print) los
         * números de 1 a 100 (ambos incluidos y con un salto de línea entre
         * cada impresión), sustituyendo los siguientes:
         * - Múltiplos de 3 por la palabra "fizz".
         * - Múltiplos de 5 por la palabra "buzz".
         * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
         */

        //Definición de variables
        String multi3="fizz";
        String multi5="buzz";

        //Algoritmo
        for (int i = 1; i <= 100; i++) {
            if (i%3 != 0 && i%5 != 0){
                System.out.print(i);
            }else {
                if (i %3 ==0){
                    System.out.print(multi3);
                }if (i %5 ==0){
                    System.out.print(multi5);
                }
            }
            System.out.println();
        }

    }
}