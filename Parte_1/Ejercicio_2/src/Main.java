import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("2. Modifica el programa anterior para que además se muestre tu\n" +
                " dirección y tu número de teléfono. Asegúrate de que los datos se muestran en \n" +
                "líneas separadas y guarda la información en variables.");
        System.out.println("------------------------------------------------------------");
        //Variables
        String nombre = "";
        String direccion = "";
        int telefono = 0;

        System.out.println("Introduce tu nombre: ");
        sc = new Scanner(System.in);
        nombre=sc.next();
        System.out.println("Introduce tu direccion: ");
        sc = new Scanner(System.in);
        direccion=sc.next();
        System.out.println("Introduce tu telefono: ");
        sc = new Scanner(System.in);
        telefono=sc.nextInt();

        //Muestra resultados
        System.out.println("Hola "+nombre+"\n"+ "direccion: "+ direccion+"\n"+ "telefono: "+telefono);



    }
}