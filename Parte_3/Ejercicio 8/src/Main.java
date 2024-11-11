import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    //8. Implementa un programa que pida al usuario un valor entero A
    // utilizando un nextInt() (de Scanner) y luego muestre por pantalla el mensaje “Valor introducido: …”.
    // Se deberá tratar la excepción InputMismatchException que lanza nextInt() cuando no se introduce un entero válido.
    // En tal caso se mostrará el mensaje “Valor introducido incorrecto”.

        //Declaración de variable
        Scanner sc = new Scanner(System.in);
        int a =0;


        //Solicitud de datos
        System.out.println("Introduzca un numero: ");
        try {
            a = sc.nextInt();
        }catch (Exception InputMismatchException) {
            System.out.println("Valor introducido incorrecto");
        }

        //Algoritmo


        //Resultados
        System.out.println("Numero introducido: " + a);
    }
}