package seccion4;

public class RemplazarSubcadenas {
    public static void main(String[] args) {
        //Remplazar sub cadena
        var cadena = "Hola mundo";
        System.out.println("Cadena Original = " + cadena);

        //Reemplazar "Mundo" por "a todos"
        var nuevacadena = cadena.replace("mundo", "a todos");
        System.out.println("nuevacadena = " + nuevacadena);

        //Remplazar "Hola" por "Saludos"
        nuevacadena = cadena.replace("Hola", "saludos");
        System.out.println("nuevacadena = " + nuevacadena);
    }
}
