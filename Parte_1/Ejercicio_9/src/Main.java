import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("9. Crea un programa que use el operador ternario para mostrar" +
                " un el valor absoluto de un número de la siguiente forma: si el número es " +
                "positivo, se mostrará tal cual; si es negativo, se mostrará cambiado de signo. ");
        System.out.println("------------------------------------------------------------");
        //variable
        int miNumero;
        int resultadoAMostrar;
        Scanner sc = new Scanner(System.in);
        //solicitud de datos
        System.out.println("Introduce tu numero: ");
        miNumero= sc.nextInt();

        //Algoritmo
        resultadoAMostrar= miNumero>0?miNumero:Math.abs(miNumero);

        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println("El resultado es: "+resultadoAMostrar);

    }
}