package seccion4;

public class BusquedaSubCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo";
        //subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("Indice 1 = " + indice1);

        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("Indice 2 = " + indice2);
    }
}
