public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("5. Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle do-while. ");
        System.out.println("------------------------------------------------------------");
        //variable
        int i =0;

        //solicitud de datos


        //Algoritmo
        do {
            if (i%5==0){
                System.out.println(i);
            }i++;
        }while (i<=100);

        //Resultados
        System.out.println("-----------------------------------------------------------");
    }
}