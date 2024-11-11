public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("8. Muestra  los  números  del  320  al  160,  contando  de  20 " +
                " en  20  hacia  atrás  utilizando  un  bucle  for.  ");
        System.out.println("------------------------------------------------------------");
        //variable
        int fin = 160;
        int gap = 20;

        //solicitud de datos


        //Algoritmo
        for (int numero = 320;numero>=fin;numero-=gap) {
            System.out.println(numero);
        }

        //Resultados
        System.out.println("-----------------------------------------------------------");
    }
}