package seccion4;

public class metodosDeCadena {
    public static void main(String[] args) {
        //meotodo de cadenas
        var cadena1 = "Hola Mundo";

        //obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);

        //Remplazar caracteres
        var nuevaCadena = cadena1.replace('o', 'a');
        System.out.println("nuevaCadena = " +nuevaCadena);

        //Convertir a mayuscula
        var mayuscula = cadena1.toUpperCase();
        System.out.println("Todo en mayuscula = " + mayuscula);

        //convertir minusculas
        System.out.println("minuscula = " + cadena1.toLowerCase());

        //Eliminar espacion al inicio y al final
        var cadena2 = "Joel Bejar Espinoza";
        System.out.println("Cadena con espacios =" +cadena2);
        System.out.println("Cadena sin espacios =" + cadena2.trim());

    }
}
