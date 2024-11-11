import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       // 4. Realiza un programa que pida introducir tres valores enteros y nos diga cuál
        // de ellos es el más elevado. Impleméntalo creando únicamente una función a la que
        // le pasemos dos valores (no tres) y nos devuelva el máximo de los dos valores.

        //variable
        int valor1;
        int valor2;
        int valor3;
        Scanner sc = new Scanner(System.in);
        int valorFinal;

        //solicitud de datos
        System.out.println("Introduzca el primer valor: ");
        valor1 = sc.nextInt();
        System.out.println("Introduzca el segundo valor: ");
        valor2 = sc.nextInt();
        System.out.println("Introduzca el tercer valor: ");
        valor3 = sc.nextInt();

        //Algoritmo
        valorFinal= valorMasGrande(valor1,valor2);
        valorFinal= valorMasGrande(valorFinal,valor3);

        //Resultados
        System.out.println("El numero mas grade es : "+ valorFinal);

    }
    public static int valorMasGrande(int a, int b){
        int resultado = a>b?a:b;
        return resultado;
    }
}