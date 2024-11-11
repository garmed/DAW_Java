public class Main {
    public static void main(String[] args) {
                System.out.println("------------------------------------------------------------");
                System.out.println("9. Muestra  los  números  del  320  al  160,  contando  de  20 " +
                        " en  20  hacia  atrás  utilizando  un  bucle  while.  ");
                System.out.println("------------------------------------------------------------");
                //variable
                int numero = 320;
                int fin = 160;
                int gap = 20;

                //solicitud de datos


                //Algoritmo
                while (numero >= fin) {
                    System.out.println(numero);
                    numero -= gap;
                }

                //Resultados
                System.out.println("-----------------------------------------------------------");
            }

}