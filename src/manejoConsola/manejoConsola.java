package manejoConsola;

import java.util.Scanner;

public class manejoConsola {
    public static void main(String[] args) {
        // Introducir valores por consola
        var consola = new Scanner(System.in);
        System.out.print("Escribe tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Nombre = " + nombre);
    }
}
