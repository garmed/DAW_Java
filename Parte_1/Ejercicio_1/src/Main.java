import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Escribe una programa que muestre tu nombre por pantalla.");
        System.out.println("------------------------------------------------------------");

        System.out.println("Introduce tu nombre: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola "+sc.next());
    }
}