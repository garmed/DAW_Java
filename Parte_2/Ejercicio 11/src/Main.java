import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("11. Realiza   el   control   de   acceso   a   una   caja   fuerte." +
                "La   combinación   será   un   número   de   4   cifras.   El   programa  " +
                "nos   pedirá   la   combinación   para   abrirla.   Si   no   acertamos,   " +
                "se   nos   mostrará   el   mensaje   “Lo   siento,   esa   no   es   la   " +
                "combinación”   y   si   acertamos   se   nos   dirá   “La   caja   fuerte   " +
                "se   ha   abierto   satisfactoriamente”.   Tendremos   cuatro   oportunidades   " +
                "para   abrir   la   caja   fuerte.");
        System.out.println("------------------------------------------------------------");
        //variable
        Scanner sc = new Scanner(System.in);
        int combinacionExito = 1234;
        int combinacionIntroducia;
        int intentos=4;
        boolean continuar = true;
        String mensaje;
        //solicitud de datos
        do {
            System.out.println("Introduce la combinacion:");
            combinacionIntroducia = sc.nextInt();
            if(combinacionIntroducia>9999){
                System.out.println("-----------------------------------------------------------");
                System.out.println("No es un valor valido;");
                mensaje="No es un valor valido;";
            }
            //Algoritmo
            else {
                if (combinacionIntroducia==combinacionExito) {
                    System.out.println("-----------------------------------------------------------");
                    mensaje="se   ha   abierto   satisfactoriamente";
                    continuar = false;
                }else {
                    System.out.println("-----------------------------------------------------------");
                    System.out.println("Lo   siento,   esa   no   es   la combinación");
                    mensaje="Se ha bloqueado, intentalo mas tarde";
                }
            }
            intentos--;
            if(continuar==true){
            if(intentos==0){continuar=false;}else {
                System.out.println("-----------------------------------------------------------");
                System.out.println("Le quedan "+intentos+" intentos.");
                }}
        }while (continuar==true);
        System.out.println("-----------------------------------------------------------");
        System.out.println(mensaje);
    }
}