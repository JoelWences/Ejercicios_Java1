package manejoConsola;

import java.util.Scanner;

public class SistemaDeEmpleados {
    public static void main(String[] args) {
        System.out.print("*** Sistema de empleados ***");

        var consola = new Scanner(System.in);
        //nombre del empleado
        System.out.print("Ingresa el nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        //edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        //Salario del empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es jefe de departamente
        System.out.print("Es jefe de departamento ? (True/False): )");
        var EsJefe = Boolean.parseBoolean(consola.nextLine());

        /*
        //imprimir datos del empleado
        System.out.println("\n datos del empleado: ");
        System.out.println("\t nombre: " + nombreEmpleado);
        System.out.println("\t edad: " + edadEmpleado);
        System.out.println("\t salario: " + salarioEmpleado);
        System.out.println("\t es jefe de departamento ?: " + EsJefe);
        */

        var datosEmpleado = String.join("\nombre del empleado",
                "Nombre: " + nombreEmpleado,
                "Edad: " + edadEmpleado + " años ",
                "Salario: " + salarioEmpleado,
                "¿Es jefe?: " + EsJefe
        );
        System.out.println(datosEmpleado);



    }
}
