package seccion4;

public class caracteresEspeciales {
    public static void main(String[] args) {
        var cadena1 = "Hola \n mundo";
        System.out.println("cadena1 = " + cadena1);

        var cadena2 = "\tHola \tmundo";
        System.out.println("cadena2 = " + cadena2);

        //'\'' comilla simplre
        var cadena3 = "Hola \' mundo";
        System.out.println("cadena3 = " + cadena3);

        var cadena4 = "Hola \" mundo";
        System.out.println("cadena4 = " + cadena4);

    }
}
