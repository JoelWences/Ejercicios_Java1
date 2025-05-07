package seccion4;

public class IndicesCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola mundo";

        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("Primer caracter es: " + primerCaracter);

        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("Ultimo caracter es: " + ultimoCaracter);

        var letram = cadena1.charAt(5);
        System.out.println("Letram es: " + letram);

    }
}
