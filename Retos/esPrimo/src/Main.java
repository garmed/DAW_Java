import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
         * Escribe un programa que se encargue de comprobar si un número es o no primo.
         * Hecho esto, imprime los números primos entre 1 y 100.
         */
        //Definición de variables
        int numeroIntroducido;
        Scanner sc = new Scanner(System.in);

        //Solicitud de datos
        //System.out.println("Introduzca el numero: ");
        //numeroIntroducido = sc.nextInt();

        //Algoritmo
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)==true){
                System.out.println("El numero " + i + " es primo");
            }
        }

        //Resultados
    }
    public static boolean esPrimo(int numero) {
        if (numero<2){return false;}
        for (int i = 2; i < Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}