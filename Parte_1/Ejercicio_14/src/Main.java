import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------------");
        System.out.println("14. Escribe un programa que calcule el precio final de un producto" +
                " según su base imponible (precio antes de impuestos), el tipo de IVA aplicado " +
                "(general, reducido o superreducido) y el código promocional. Los tipos de IVA " +
                "general, reducido y superreducido son del 21%, 10% y 4% respectivamente." +
                " Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan " +
                "respectivamente que no se aplica promoción, el precio se reduce a la mitad, se " +
                "descuentan 5 euros o se descuenta el 5%. " +
                "El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén tabulados. " +
                "Ejemplo: " +
                "Introduzca la base imponible: 25 " +
                "Introduzca el tipo de IVA (general, reducido o superreducido): reducido " +
                "Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad " +
                "Base imponible 25.00 " +
                "IVA (10%) 2.50 " +
                "Precio con IVA 27.50 " +
                "Cód. promo. (mitad): -13.75 " +
                "TOTAL 13.75 ");
        System.out.println("------------------------------------------------------------");
        //variable
        float baseImponible;
        float precioConImpuestos;
        float precioFinal;

        //tipos iva aplicado
        int tipoIVA;
        float IVAgeneral = 21;
        float IVAreducido = 10;
        float IVAsuperreducido = 4;
        float IVA = 0;

        //tipo de promoción
        float promocion=0;
        float nopro = 0;
        float mitad = 50;
        float meno5 = -5;
        float porc5 = 5;
        int tipoPromo;
        String nombrePromo="";

        Scanner sc = new Scanner(System.in);
        //solicitud de datos
        System.out.print("Introduzca la base imponible: ");
        baseImponible = sc.nextFloat();

        System.out.println("Elige el tipo de IVA:" +"\n"+
                "1 - IVA general : "+IVAgeneral+"%" +"\n"+
                "2 - IVA reducido : "+IVAreducido+"%" +"\n"+
                "3 - IVA superreducido : "+IVAsuperreducido+"%");
        tipoIVA = sc.nextInt();
        // asignamos el tipo de iva
            if (tipoIVA < 4 && tipoIVA>0) {
                switch (tipoIVA) {
                    case 1:
                        IVA=IVAgeneral;
                        break;
                    case 2:
                        IVA=IVAreducido;
                        break;
                    case 3:
                        IVA=IVAsuperreducido;
                        break;
                }
            // calculamos el precio con iva


            System.out.println("Selecciona el codigo promocional: " +"\n"+
                    "1 - Sin promoción " +"\n"+
                    "2 - Mitad de precio" +"\n"+
                    "3 - Menos 5 euros" +"\n"+
                    "4 - 5% descuento");
            tipoPromo = sc.nextInt();
            // asignamos el tipo de promocion
            if (tipoPromo < 5 && tipoPromo>0) {
                switch (tipoPromo){
                    case 1:
                        promocion=nopro;
                        nombrePromo="Sin promocion";
                        break;
                    case 2:
                        promocion=mitad;
                        nombrePromo="Mitad de precio";
                        break;
                    case 3:
                        promocion=meno5;
                        nombrePromo="Menos 5 euros";
                        break;
                    case 4:
                        promocion=porc5;
                        nombrePromo="5% descuento";
                        break;

                }

                precioConImpuestos = baseImponible + (baseImponible * (IVA/100));

                if(promocion>0){
                    precioFinal=precioConImpuestos*(promocion/100);
                }
                else {
                    precioFinal=precioConImpuestos+meno5;
                }

            //Resultados
            System.out.println("-----------------------------------------------------------");
            System.out.println("Base imponible "+ baseImponible +"\n"+
                    "      IVA (" +IVA+"%)"+"\n"+
                    "      Precio con IVA " +precioConImpuestos+"\n"+
                    "      Cód. promo. ("+nombrePromo+"): " + (precioFinal-precioConImpuestos) +"\n"+
                    "      TOTAL " + precioFinal );
        }}
    }
}