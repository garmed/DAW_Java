public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------------------");
        System.out.println("5. Escribe un programa en el que se declaren las variables enteras \n"+
                "x e y. Asígnales los valores 144 y 999 respectivamente. A continuación, \n"+
                "muestra por pantalla el valor de cada variable, la suma, la resta, la división y la multiplicación. ");
        System.out.println("------------------------------------------------------------");

        //Variables
        int x=144;
        int y=999;
        int suma = x+y;
        int resta = x-y;
        float division = (float)x/y;
        int multiplicacion = x*y;

        System.out.println("Variable x: "+x+"\n"+ "Variable y: "+y);
        System.out.println("Suma: "+x+" + "+y+" = "+ suma);
        System.out.println("Resta: "+x+" - "+y+" = "+ resta);
        System.out.println("Division: "+x+" / "+y+" = "+ division);
        System.out.println("Multiplicacion: "+x+" * "+y+" = "+ multiplicacion);


    }
}