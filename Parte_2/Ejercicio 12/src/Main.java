import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("12. Realiza un programa que nos diga cuántos dígitos tiene un " +
                "número introducido por teclado.  ");
        System.out.println("------------------------------------------------------------");
        //variable
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido;
        int resultado=0;
        int nDigitos=0;
        int gap = 1;

        //solicitud de datos
        System.out.println("Introduce un numero:");
        numeroIntroducido = sc.nextInt();

        //Algoritmo
        while (resultado!=numeroIntroducido){
            nDigitos++;
            resultado=numeroIntroducido%gap;
            gap=gap*10;
        }
        nDigitos=nDigitos-1;

        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println("El numero " + numeroIntroducido + " tiene " + nDigitos + " digitos");
    }
}