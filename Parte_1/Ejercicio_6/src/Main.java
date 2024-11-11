import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");
        System.out.println("6. Realiza un conversor de euros a dolares. La cantidad en euros \n"+
                "que se quiere convertir deberá estar almacenada en una variable.");
        System.out.println("------------------------------------------------------------");

        //Variables
        float dineroEnEuros;
        float dineroEnDolares;
        float valorDeCambio = (float)1.5; // 1 euro = valorDeCambio $
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor en euros a convertir: ");
        dineroEnEuros=sc.nextFloat();
        dineroEnDolares=dineroEnEuros*valorDeCambio;

        System.out.println(dineroEnEuros + "€ son " + dineroEnDolares +"$");
        System.out.println("Calculado con un valor de cambio de  "+valorDeCambio);

    }
}