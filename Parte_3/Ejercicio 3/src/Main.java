import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //3. Escribe un programa que pida cinco precios y muestre por pantalla el precio
        // de venta de cada uno tras aplicarle un 21% de IVA. Implementa y utiliza la función:
        // double precioConIVA(double precio)
        // Devuelve el precio tras sumarle un 21% de IVA

        //variable
        Scanner sc = new Scanner(System.in);
        int numObjetos=5;
        String mensaje="";
        double valor;
        double valorConIVA;

        //Algoritmo
        for (int i = 1; i <= numObjetos; i++) {
            System.out.println("Introduzca el precio del objeto "+i+"/"+numObjetos+":");
            valor = sc.nextDouble();
            valorConIVA = precioConIVA(valor);
            mensaje=mensaje+("El precio final del ojeto "+i+"/"+numObjetos+" es: "+redondeadoA2(valorConIVA)+"€\n");
        }

        //Resultados
        System.out.println(mensaje);
    }
    public static double precioConIVA(double precio) {
       double IVA=0.21;
       double precioFinal=precio*IVA +precio;
       return precioFinal;
    }
    public static double redondeadoA2(double valor) {
        double redondeado=Math.round(valor*100);
        return redondeado/100;
    }
}