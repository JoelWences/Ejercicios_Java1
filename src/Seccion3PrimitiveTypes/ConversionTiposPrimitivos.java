package Seccion3PrimitiveTypes;


import java.util.Scanner;

public class ConversionTiposPrimitivos {

    public static void main(String[] args) {
        //convertir un String a un a un tipo int

        /*var edad = Integer.parseInt("20");
        System.out.println("La edad es" +(edad+1));*/

        var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad+1));

        var consola = new Scanner(System.in);
        System.out.println("Porporsiona tu edad");
        edad = Integer.parseInt( consola.nextLine() );
        System.out.println("edad = " + edad);
    }

}
