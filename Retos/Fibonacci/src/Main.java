public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que imprima los 50 primeros números de la sucesión
         * de Fibonacci empezando en 0.
         * - La serie Fibonacci se compone por una sucesión de números en
         *   la que el siguiente siempre es la suma de los dos anteriores.
         *   0, 1, 1, 2, 3, 5, 8, 13...
         */
        long numA=0;
        long numB=1;
        long numPrint=0;

        for (int i=1;i<=50;i++){
            System.out.println(numPrint);
            numPrint = numA+numB;
            numB = numA;
            numA = numPrint;


        }
    }
}