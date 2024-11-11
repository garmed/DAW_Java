import java.text.DecimalFormat;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("7. Realiza un conversor de dolares a euros. La cantidad en " +
                "pesetas que se quiere convertir deberá estar almacenada en una variable. ");
        System.out.println("------------------------------------------------------------");

        //Variables
        float dineroEnEuros;
        float dineroEnDolares;
        float valorDeCambio=(float) 1.5; // 1 euro = valorDeCambio $
        Scanner sc = new Scanner(System.in);

        //Entrada de datos
        System.out.println("Ingrese el valor en dolares a convertir: ");
        dineroEnDolares=sc.nextFloat();

        //Algoritmo
        dineroEnEuros=dineroEnDolares/valorDeCambio;
        DecimalFormat df = new DecimalFormat("#.00");

        //Impresion de resultados
        System.out.println(dineroEnDolares + "$ son " + df.format(dineroEnEuros) +"€");
        System.out.println("Calculado con un valor de cambio de  "+valorDeCambio);



    }
}