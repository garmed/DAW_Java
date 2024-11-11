import java.util.Scanner;

public class Main {
    static int DECIMALES= 5;
    public static void main(String[] args) {
        //7. Escribe un programa que muestre un menú con 2 opciones: “1.Circunferencia” y “2.Área”.
        // En ambas se le pedirá al usuario que introduzca un radio y luego se le mostrará el cálculo oportuno.
        // A) Implementa las funciones:
        //      int menu() --> Muestra el menú y devuelve el número elegido
        //      double pideRadio() --> Pide que se introduzca el radio y lo devuelve
        //      double circunferencia(double r) --> Calcula la circunferencia y la devuelve
        //      double area(double r) --> Calcula el área y la devuelve
        // B) Modifica el programa añadiendo otra opción llamada “Volumen”, permitiendo que el usuario también pueda
        //          solicitar el cálculo del volumen.
        //      Añade la función: double volumen(double r) --> Calcula el volumen y lo devuelve
        //
        // C) Modifica el programa añadiendo otra opción llamada “Todas” en la que se pida el radio una sola vez y se
        //          muestren los tres cálculos posibles (circunferencia, área y volumen).
        // D) Modifica el programa anterior de modo que el proceso se repita una y otra vez (mostrar menú -> realizar el cálculo -> volver a mostrar menú).
        //      Añade una opción más llamada “Salir” que terminará el programa si es elegida.
        boolean run = true;
        do {
            int eleccion = menu();
            switch (eleccion) {
                case 1:
                    System.out.println("El valor de la circunferencia es: " + redondeo(circunferencia(pideRadio())));
                    break;
                case 2:
                    System.out.println("El valor del area es: " + redondeo(area(pideRadio())));
                    break;
                case 3:
                    System.out.println("El valor del volumen es: " + redondeo(volumen(pideRadio())));
                    break;
                case 4:
                    double radio=pideRadio();
                    System.out.println("El valor de la circunferencia es: " + redondeo(circunferencia(radio)));
                    System.out.println("*****************************");
                    System.out.println("El valor del area es: " + redondeo(area(radio)));
                    System.out.println("*****************************");
                    System.out.println("El valor del volumen es: " + redondeo(volumen(radio)));
                    System.out.println("*****************************");
                    break;
                case 5:
                    run = false;
                    break;
                default:
                    System.out.println("No es una opcion correcta");
                    break;
            }
        }while (run);

    }
    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------------------");
        System.out.println("Selecciona una opcion: ");
        System.out.println("1. Circunferencia");
        System.out.println("2. Area");
        System.out.println("3. Volumen");
        System.out.println("4. Todas");
        System.out.println("5. Salir");
        return sc.nextInt();
    }
    public static double pideRadio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor del radio: ");
        return  sc.nextDouble();
    }
    public static double circunferencia(double radio){
        System.out.println("C = 2 * "+radio+" * "+Math.PI);
        return 2*radio*Math.PI;
    }
    public static double area(double radio){
        System.out.println("A = "+radio+"^2 * "+Math.PI);
        return Math.PI*radio*radio;
    }
    public static double volumen(double radio){
        // v=4/3*pi*r^3
        System.out.println("V = 4/3 * "+radio+"^3 * "+Math.PI);
        return (4/3*radio*radio*radio*Math.PI);
    }

    public static double redondeo(double a){
        double v100= Math.pow(10,DECIMALES);
        return Math.round(a*v100)/v100;
    }
}