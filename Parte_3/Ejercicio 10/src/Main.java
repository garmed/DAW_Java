import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        //10. Implementa un programa con tres funciones:
        // • void imprimePositivo(int p): Imprime el valor p. Lanza una ‘Exception’ si p < 0
        // • void imprimeNegativo(int n): Imprime el valor n. Lanza una ‘Exception’ si p >= 0
        // • La función main para realizar pruebas. Puedes llamar a ambas funciones varias
        //      veces con distintos valores, hacer un bucle para pedir valores por teclado
        //      y pasarlos a las funciones, etc. Maneja las posibles excepciones.

        int bucle=5;
        for (int i=0;i<bucle;i++){
            try {
                System.out.println("Valor positivo:");
                imprimePositivo(introduce());
                System.out.println("Valor negativo:");
                imprimeNegativo(introduce());
            }catch (Exception e){
                System.out.println(e);
            }

        }
    }
    public static int introduce(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero:  ");
        return sc.nextInt();
    }
    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("No puede ser negativo");
        }
        else {
            System.out.println(p);
        }
    }
    public static void imprimeNegativo(int p) throws Exception {
        if (p > 0) {
            throw new Exception("No puede ser positivo");
        }
        else {
            System.out.println(p);
        }
    }
}