import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("4. Realiza  un  programa  que  diga  si  un  número  entero " +
                " positivo  introducido  por  teclado  es  capicúa.  Se  permiten  números  de  hasta  5  cifras.  ");
                System.out.println("------------------------------------------------------------");
        //variable
        Scanner sc = new Scanner(System.in);

        //solicitud de datos
        System.out.print("Introduzca el numero: ");
        int num = sc.nextInt();
        String respuesta="";
        String tipoRespuestaSi =  num + " es capicúa";
        String tipoRespuestaNo = num + " no es capicúa";

        //Algoritmo
        if (num >0 && num < 10) {
            respuesta = num + " no se puede valorar";
        }else if (num >=10 && num < 100) {
            int digito1 = (int) num/10;
            int digito2 = num % 10;
            if(digito1==digito2) {
                respuesta = tipoRespuestaSi;
            }else {
                respuesta = tipoRespuestaNo;
            }
        }else if (num >=100 && num < 1000) {
            int digito1 = (int) num/100;
            int digito23 = num % 100;
            int digito2 = (int) digito23/10;
            int digito3 = digito23 % 10;
            if(digito1==digito3) {
                respuesta = tipoRespuestaSi;
            }else {
                respuesta = tipoRespuestaNo;
            }
        }else if (num >=1000 && num < 10000) {
            int digito1 = (int) num/1000;
            int digito234 = num % 1000;
            int digito2 = (int) digito234/100;
            int digito34 = digito234 % 100;
            int digito3 = (int) digito34/10;
            int digito4 = digito34 % 10;
            if(digito1==digito4&&digito2==digito3) {
                respuesta = tipoRespuestaSi;
            }else {
                respuesta = tipoRespuestaNo;
            }
        }else if (num >=10000 && num < 100000) {
            int digito1 = (int) num / 10000;
            int digito2345 = num % 10000;
            int digito2 = (int) digito2345 / 1000;
            int digito345 = digito2345 % 1000;
            int digito3 = (int) digito345 / 100;
            int digito45 = digito345 % 100;
            int digito4 = (int) digito45 / 10;
            int digito5 = digito45 % 10;

            if (digito1 == digito5 && digito2 == digito4) {
                respuesta = tipoRespuestaSi;
            } else {
                respuesta = tipoRespuestaNo;
            }
        }else {
            respuesta = num + " no es un numero valido";
        }


        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println(respuesta);
    }
}