package seccion4;

public class ManejoSubCadenas {

    public static void main(String[] args) {
        var cadena1 = "Hola mundo";
        System.out.println("cadena1 = " + cadena1);

        //Subcadena
        var subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);

        var subvadena2 = cadena1.substring(5,10);
        System.out.println("Subcadena2 = " + subvadena2);

    }
}
