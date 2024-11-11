import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("1. Escribe un programa que pida por teclado un día de la semana " +
                "y que diga qué asignatura toca a primera hora ese día.");
        System.out.println("------------------------------------------------------------");

        //variable
        String lunes="Matemáticas";
        String martes="Lengua";
        String miercoles="Ingles";
        String jueves="Historia";
        String viernes="Matemáticas";
        String seleccionDia="";
        String respuesta="";
        Scanner sc = new Scanner(System.in);

        do {
            //solicitud de datos
            System.out.println("Introduce un dia de la semana: ");
            seleccionDia = sc.nextLine();
            seleccionDia = seleccionDia.toUpperCase();
            respuesta = switch (seleccionDia) {
                case "LUNES" -> lunes;
                case "MARTES" -> martes;
                case "MIERCOLES" -> miercoles;
                case "JUEVES" -> jueves;
                case "VIERNES" -> viernes;
                default -> "ERROR";
            };
            //Resultados
            System.out.println("-----------------------------------------------------------");
            System.out.println("Ese dia tienes " + respuesta + " a primera hora");
        }while (!seleccionDia.equals(""));
        }
    }
