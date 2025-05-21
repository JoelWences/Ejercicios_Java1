package manejoConsola;

import java.util.Scanner;

public class RecetaComidas {
    public static void main(String[] args) {

        System.out.println("*** Receta de Cocina ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa el nombre: ");
        var nombreComida = consola.nextLine();

        System.out.print("Ingrese los ingredientes: ");
        var ingredientes = consola.nextLine();

        System.out.print("Ingrese el tiempo de preparacion: " );
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        System.out.print("Dificultad (facil,medio,dificil):");
        var dificultadPreparacion = consola.nextLine();

        var datosReceta = "--Receta de la comida--\n" + String.join("\n",
                "El nombre de la comida es: " + nombreComida,
                "Los ingredientes son: " + ingredientes,
                "El tiempo de preparacion es: " + tiempoPreparacion + " hora",
                "La dificultad de la preparacion es: " + dificultadPreparacion
        );

        System.out.println(datosReceta);

    }
}
