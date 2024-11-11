import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("10. Usa el operador ternario para calcular el menor de dos números. ");
        System.out.println("------------------------------------------------------------");
        //variable
        int numeroA;
        int numeroB;
        int Resultado;
        Scanner sc = new Scanner(System.in);
        //solicitud de datos
        System.out.print("Ingrese el numero A: ");
        numeroA = sc.nextInt();
        System.out.print("Ingrese el numero B: ");
        numeroB = sc.nextInt();

        //Algoritmo
        Resultado = numeroA < numeroB ? numeroA : numeroB;

        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println("El menor es: " + Resultado);
    }
}