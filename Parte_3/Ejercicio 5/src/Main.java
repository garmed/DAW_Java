import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //5. Realiza un programa que calcule el porcentaje de descuento que nos han
        // hecho al comprar algo. Se debe solicitar la cantidad sin descuento y la
        // cantidad con el descuento aplicado. Se debe crear una función a la que le
        // pasemos ambos valores y nos devuelva el descuento.

        //variable
        double precioConDescuento;
        double precioSinDescuento;
        double descuento;
        Scanner sc = new Scanner(System.in);

        //solicitud de datos
        System.out.println("Ingrese el precio con descuento: ");
        precioConDescuento = sc.nextDouble();
        System.out.println("Ingrese el precio sin descuento: ");
        precioSinDescuento = sc.nextDouble();

        //Algoritmo
        descuento = porcentajeDiferencia(precioSinDescuento, precioConDescuento);

        //Resultados
        System.out.println("El descuento es: " + descuento +"%");

    }
    public static double porcentajeDiferencia(double valorCompleto, double valorFinal) {
        //valorCompleto=100
        //valorFinal = X%
        // X% = valorFinal * 100 / valorCompleto
        double resultado =  valorFinal * 100 / valorCompleto;
        return redondeo(resultado);

    }
    public static double redondeo(double a){
        return Math.round(a*100)/100.00;
    }
}