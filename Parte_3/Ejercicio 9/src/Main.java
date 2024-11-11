import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 9. Implementa un programa que pida dos valores int A y B utilizando un nextInt() (de Scanner),
        // calcule A/B y muestre el resultado por pantalla.
        // Se deberán tratar de forma independiente las dos posibles excepciones, InputMismatchException y ArithmeticException,
        // mostrando en cada caso un mensaje de error diferente en cada caso.

        //Declaración de variable
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=0;
        float resultado=0;
        //Solicitud de datos
        try {
            System.out.println("Introduzca un numero entero A: ");
            a = sc.nextInt();
            System.out.println("Introduzca un numero entero B: ");
            b = sc.nextInt();
            resultado = a/(float)b;
            System.out.println(a+" / "+ b + " = "+resultado);

        }catch (InputMismatchException ex) {
            System.out.println("No es un valor valido " + ex);
        }
        catch (ArithmeticException ex) {
            System.out.println("No es una operacion valida " + ex);
        }
    }
}