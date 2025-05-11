package seccion4;

public class MasFormasdeConcatenar {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2 ;
        System.out.println("Cadena 3 usando + = " + cadena3);

        //metodo concat
        cadena3 = cadena1.concat(" ").concat("mundo");
        System.out.println("Metodo cocant = " + cadena3);

        //metodo StringBuilder
        var constructorcadenas = new StringBuilder();
        constructorcadenas.append(cadena1);
        constructorcadenas.append(" ");
        constructorcadenas.append(cadena2);
        var resultado = constructorcadenas.toString();
        System.out.println("Resultado metodo StringBuilder = " + resultado);

        //StringBuffer para trabajar con hilos
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("Resultado StringBuffer = " + resultado);

        //join
        resultado = String.join(" ", cadena1,cadena2, "Adios");
        System.out.println("Resultado StringJoin = " + resultado);



    }
}
