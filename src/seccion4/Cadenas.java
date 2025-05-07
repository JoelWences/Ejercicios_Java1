package seccion4;

public class Cadenas {
    public static void main(String[] args) {
        System.out.println("**** Manejo de cadenas **** ");

        var cadena1 = "Hola";
        var cadena2 = new String("Mundo");
        var cadena3 = cadena1 + " " + cadena2;

        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena3 = " + cadena3);

        //Cadenas de multilinea
        var cadena4 = """
                Hola
                como
                estas
                """;
        System.out.println("cadena4 = " + cadena4);
    }
}
