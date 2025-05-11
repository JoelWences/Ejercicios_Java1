package manejoConsola;

import java.util.Scanner;

public class leerTiposDatos {
    public static void main(String[] args) {
        //leer tipos de datos
        //leer un tipo int
        var consola = new Scanner(System.in);
        System.out.print("Escribe tu edad: ");
        var edad = consola.nextInt();
        System.out.println("Edad = " + edad);
        //leer tipo double
        System.out.print("Ingrese tu altura: ");
        var altura = consola.nextDouble();
        System.out.println("Altura = " + altura);
        //leer tipo Strin
        consola.nextLine();
        System.out.print("Ingesa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre = " + nombre);
    }
}
