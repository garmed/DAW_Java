import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe una función que calcule si un número dado es un número de Armstrong
         * (o también llamado narcisista).
         * Si no conoces qué es un número de Armstrong, debes buscar información
         * al respecto.
         */
        //Definición de variables
        Scanner sc = new Scanner(System.in);
        int  numero;

        //Solicitud de datos
        System.out.println("Introduzca el numero: ");
        numero = sc.nextInt();

        //Algoritmo
        if (esNarcisista(numero)) {
            System.out.println("El numero es: " + numero+ " es narcisista");
        }


    }
    public static boolean esNarcisista(int numero) {
        String numChar = String.valueOf(numero);
        int nNumeros = numChar.length();
        double suma=0;
        double sumatorio=0;
        int numeroI;
        for (int i = 0; i < nNumeros; i++) {
            numeroI  = numChar.charAt(i)- '0';
            sumatorio = Math.pow(numeroI,nNumeros);
            suma = sumatorio+suma;
        }
        return Math.round(suma) == numero;
    }
}