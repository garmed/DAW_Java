import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Escribe un programa que pida dos números reales por teclado y muestre " +
                "por pantalla el resultado de multiplicarlos. Implementa y utiliza la función: " +
                "double multiplica(double a, double b) --> Devuelve la multiplicación de dos números ");
        System.out.println("------------------------------------------------------------");
        //variable
        Scanner sc = new Scanner(System.in);
        double numero1;
        double numero2;
        double resultado;

        //solicitud de datos
        System.out.println("Introduce un número:");
        numero1 = sc.nextDouble();

        System.out.println("Introduce otro número:");
        numero2 = sc.nextDouble();

        //Algoritmo
        resultado = multiplica(numero1,numero2);

        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println("El resultado de multiplicar "+ numero1 +" y "+ numero2 +" es: " + resultado);
    }
    public static double multiplica(double a, double b) {
        double multiplicacion =a*b;
        return multiplicacion;
    }
}