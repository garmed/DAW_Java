import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2. Escribe un programa que pida la edad por teclado y muestre por pantalla si eres
        // mayor de edad o no. Implementa y utiliza la función:
        // boolean esMayorEdad(int a)
        // Devuelve verdadero si a>=18, falso en caso contrario
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        boolean consulta;
        consulta = esMayorEdad(num);
        if (consulta==true) {
            System.out.println("Es mayor de edad");

        }else {
            System.out.println("Es menor de edad");
        }
    }
    public static boolean esMayorEdad(int a){
        return a >= 18;
    }
}