package seccion4;

public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //comparacion de cadenas (==)comparan la referencia en memoria
        System.out.print("Cadena 1 es igual en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        System.out.println(cadena1 == cadena3);

        //Comparar contenido se usa el metodo Equals
        System.out.print("Cadena 1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

    }
}
