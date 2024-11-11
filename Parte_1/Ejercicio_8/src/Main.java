import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("8. Escribe un programa que calcule el total de una factura a partir" +
                " de la base imponible (precio sin IVA). La base imponible estará almacenada " +
                "en una variable. ");
        System.out.println("------------------------------------------------------------");
        //variable
        float baseImponible;
        float precioTotal;
        float IVA = (float) 21; //IVA es un porcentaje

        //solicitud de datos
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor de la base de imponible: ");
        baseImponible = sc.nextFloat();

        //Algoritmo
        precioTotal = baseImponible * IVA;

        //Resultados
        System.out.println("El precio total es: "+ precioTotal);
        System.out.println("-----------------------------------------------------------");
        System.out.println("Base imponible: " + baseImponible);
        System.out.println("IVA: " + IVA);

    }
}