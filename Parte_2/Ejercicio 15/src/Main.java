import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("15. Realiza   un   programa   que   pida   un   número   por   " +
                "teclado   y   que   luego   muestre   ese   número   al   revés.  ");
        System.out.println("------------------------------------------------------------");

        //variable
        Scanner sc = new Scanner(System.in);
        int numeroIntroducido;
        int nDigitos;
        int mod=10;
        int print=0;

        //solicitud de datos
        System.out.println("Escribe um numero: ");
        numeroIntroducido = sc.nextInt();

        //Algoritmo
        nDigitos=contarNumeros(numeroIntroducido);
        for (int i = 1; i <= nDigitos; i++) {
            print=numeroIntroducido%mod;
            numeroIntroducido=numeroIntroducido/mod;
            System.out.print(print);

        }
        System.out.println();

        //Resultados
        System.out.println("-----------------------------------------------------------");

    }
    public static int contarNumeros(int numeroIntroducido) {
        //variable
        int resultado=0;
        int nDigitos=0;
        int gap = 1;

        //Algoritmo
        while (resultado!=numeroIntroducido){
            nDigitos++;
            resultado=numeroIntroducido%gap;
            gap=gap*10;
        }
        nDigitos=nDigitos-1;
        return(nDigitos);
    }
}
