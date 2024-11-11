import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("11. Realiza un programa que utilice tres variables enteras edad, " +
                "nivelestudios e ingresos. El programa deberá guardar en una variable booleana " +
                "resultado: " +
                "   Verdadero→ si la edad es menor o igual a 28 y el nivel de estudios es mayor " +
                "       que tres, o bien, la edad es menor de 30 y los ingresos superan los 28000€." +
                "   Falso→ En caso contrario. " +
                "Utilizar el operador ternario obligatoriamente. ");
        System.out.println("------------------------------------------------------------");
        //variable
        int edad;
        int nivelEstudios;
        int nivelIngresos;
        String resultado;
        Scanner sc = new Scanner(System.in);

        //solicitud de datos
        System.out.println("Ingrese su edad: ");
        edad = sc.nextInt();
        System.out.println("Ingrese su nivel de estudios: \n" +
                "    1 - Educación Infantil. \n" +
                "    2 - Educación Primaria. \n" +
                "    3 - Educación Secundaria Obligatoria (ESO).\n" +
                "    4 - Bachillerato.\n" +
                "    5 - Formación Profesional (FP). \n" +
                "    6 - Enseñanzas universitarias.\n" +
                "    7 - Enseñanzas de régimen especial.\n");
        nivelEstudios = sc.nextInt();
        System.out.println("Ingrese su nivel de ingresos: ");
        nivelIngresos = sc.nextInt();

        //Algoritmo
        resultado=(edad<=28 && nivelEstudios>3)||(edad<30 && nivelIngresos>28000)?"Verdadero":"Falso";

        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println("Resultado: "+resultado);

    }
}