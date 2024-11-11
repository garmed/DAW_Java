import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("14. Escribe   un   programa   que   lea   un   número   n   e  " +
                "imprima   una   pirámide   de   números   con   n   filas   como   en   la   " +
                "siguiente   figura:   \n" +
                "1   \n" +
                "121   \n" +
                "12321   \n" +
                "1234321   \n");
        System.out.println("------------------------------------------------------------");
        //variable
        Scanner sc = new Scanner(System.in);
        int n;
        int k=1;
        //solicitud de datos
        System.out.println("Introduce un numero: ");
        n = sc.nextInt();

        //Algoritmo
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                k=j-1;
            }
            while (k>0){

                System.out.print(k);
                k--;
            }
            System.out.println();
        }

        //Resultados
        System.out.println("-----------------------------------------------------------");

    }
}