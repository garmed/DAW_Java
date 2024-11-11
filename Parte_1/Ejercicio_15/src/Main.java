import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("15. Realiza un programa que calcule la nota que hace falta sacar " +
                "en el segundo examen de la asignatura Programación para obtener la media deseada. " +
                "Hay que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo " +
                "examen un 60%. \n" +
                "Ejemplo 1: Introduce la nota del primer examen: 7 ¿Qué nota quieres sacar en el trimestre? 8.5" +
                " Para tener un 8.5 en el trimestre necesitas sacar un 9.5 en el segundo examen. \n" +
                "Ejemplo 2: Introduce la nota del primer examen: 8 ¿Qué nota quieres sacar en el trimestre? " +
                "7 Para tener un 7 en el trimestre necesitas sacar un 6.33 en el segundo examen. ");
        System.out.println("------------------------------------------------------------");
        //variable
        float propExamenUno=40;
        float propExamenDos=60;
        float notaExamenUno=0;
        float notaExamenDos=0;
        float valorPrimerEx=0;
        float notaFinal=0;
        String resultado="";
        Scanner sc = new Scanner(System.in);


        //solicitud de datos
        System.out.print("Introduce el primer examen: ");
        notaExamenUno=sc.nextFloat();
        System.out.print("¿Qué nota quieres sacar en el trimestre?");
        notaFinal=sc.nextFloat();

        //Algoritmo

        valorPrimerEx=notaExamenUno*(propExamenUno/100);
        notaExamenDos=(notaFinal-valorPrimerEx)/(propExamenDos/100);
        DecimalFormat df = new DecimalFormat("#.00");

        if(notaExamenDos<=10) {
            resultado=df.format(notaExamenDos);
        }else{
            resultado="Mayor a 10, por tanto, no es posible obtener esa puntuación";
        }

        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println("El nota del primer examen es: " + notaExamenUno);
        System.out.println("El desada: " + notaFinal);
        System.out.println("El nota del segundo examen debe ser: " + resultado
        );


    }
}