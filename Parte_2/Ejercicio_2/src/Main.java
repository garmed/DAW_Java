import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("2. Realiza un programa que pida una hora por teclado y que muestre " +
                        "luego buenos días, buenas tardes o buenas noches según la hora. Se " +
                        "utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. " +
                        "Sólo se tienen en cuenta las horas, los minutos no se deben introducir por " +
                        "teclado. ");
        System.out.println("------------------------------------------------------------");
        //variable
        int horaIntroducida=0;
        String respuesta="";
        Scanner sc = new Scanner(System.in);

        //solicitud de datos
        System.out.print("Introduce la hora: (solo hora)");
        horaIntroducida = sc.nextInt();


        //Algoritmo
        if(horaIntroducida>24||horaIntroducida<0) {
            respuesta = "No exite esta hora";
        }
        else if(horaIntroducida>=6 && horaIntroducida<=12) {
            respuesta = "Buenos días";
        }
        else if (horaIntroducida>=13 && horaIntroducida<=20) {
            respuesta = "Buenos tardes";
        }
        else {
            respuesta = "Buenas noches";
        }
        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println(respuesta);
    }
}