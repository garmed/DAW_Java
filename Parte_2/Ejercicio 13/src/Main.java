import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("13. Realiza  un  programa  que  sume  los  100  números  siguientes" +
                " a  un  número  entero  y  positivo  introducido  por  teclado.  Se  debe  " +
                "comprobar  que  el  dato  introducido  es  correcto  (que  es  un  número  positivo).  ");
        System.out.println("------------------------------------------------------------");
        //variable
        Scanner sc = new Scanner(System.in);
        int numerosAsumar = 100;
        int numeroIntroducido;
        int resultado=0;
        //solicitud de datos
        System.out.println("Ingrese un numero positivo: ");
        numeroIntroducido = sc.nextInt();
        if (numeroIntroducido < 0) {
            System.out.println("Numero introducido no valido");
        }
        //Algoritmo
        else {
            resultado=numeroIntroducido;
            for (int i = 0; i < numerosAsumar; i++) {
                System.out.println(resultado);
                resultado = resultado+(numeroIntroducido+i);
            }
            //Resultados
            System.out.println("-----------------------------------------------------------");
            System.out.println("El resultado de sumar "+numeroIntroducido+" y  sus "+numerosAsumar+" numeros siguientes es: " + resultado);
        }

    }

}