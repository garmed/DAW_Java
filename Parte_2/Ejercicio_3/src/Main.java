import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("3. Calcula la nota de un trimestre de la asignatura Programación. El programa pedirá las dos notas que ha sacado el alumno en los dos primeros controles. Si la media de los dos controles da un número mayor o igual a 5, el alumno está aprobado y se mostrará la media. En caso de que la media sea un número menor que 5, el alumno habrá tenido que hacer el examen de recuperación que se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál ha sido el resultado de la recuperación? (apto/no apto). Si el resultado de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene la nota media anterior.  \n" +
                "Ejemplo 1:  \n" +
                "Nota del primer control: 7  \n" +
                "Nota del segundo control: 10   \n" +
                "Tu nota de Programación es 8.5   \n" +
                "Ejemplo 2:  \n" +
                "Nota del primer control: 6   \n" +
                "Nota del segundo control: 3   \n" +
                "¿Cuál ha sido el resultado de la recuperación? (apto/no apto): apto   \n" +
                "Tu nota de Programación es 5   \n" +
                "Ejemplo 3:   \n" +
                "Nota del primer control: 6  \n" +
                " Nota del segundo control: 3   \n" +
                "¿Cuál ha sido el resultado de la recuperación? (apto/no apto): no apto   \n" +
                "Tu nota de Programación es 4.5 \n");
        System.out.println("------------------------------------------------------------");
        //variable
        float notaExamenUno =0;
        float notaExamenDos =0;
        float notaMedia=0;
        float notaAsignatura=0;
        String resultadoRecuperacion="";
        Scanner sc = new Scanner(System.in);
        //solicitud de datos
        System.out.println("Ingrese la nota del primer control: ");
        notaExamenUno = sc.nextFloat();
        System.out.println("Ingrese la nota del segundo control: ");
        notaExamenDos = sc.nextFloat();

        //Algoritmo
        notaMedia = ( notaExamenUno + notaExamenDos )/2;
        if (notaMedia>=5){
            notaAsignatura=notaMedia;

        }else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no_apto)");
            resultadoRecuperacion = sc.next();
            resultadoRecuperacion = resultadoRecuperacion.toLowerCase();
            if (resultadoRecuperacion.equals("apto")){
                notaAsignatura=5;
            }else if(resultadoRecuperacion.equals("no_apto")) {
                notaAsignatura=notaMedia;
            }
            else {
                System.out.println("Error: No existe la opcion seleccionada ");
            }
        }

        //Resultados
        System.out.println("-----------------------------------------------------------");
        System.out.println("Nota del primer control:"+notaExamenUno);
        System.out.println("Nota del segundo control:"+notaExamenDos);
        System.out.println("Tu nota en programacion es: "+notaAsignatura);
    }
}