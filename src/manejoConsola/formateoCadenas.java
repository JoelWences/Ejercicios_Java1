package manejoConsola;

public class formateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de cadenas ***");
        var nombre = "matias";
        var edad = 35;
        var salario = 1231.50343;

        //String.format
        var mensaje =String.format("Nombre: %s, Edad: %d, salario: %.2f"
                , nombre, edad , salario);
        System.out.println(mensaje);

        //metodo printf
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n"
                ,nombre,edad,salario);

    }
}
