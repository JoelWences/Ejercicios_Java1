package Seccion3PrimitiveTypes;

public class TipoBoolean {
    public static void main(String[] args) {
        boolean varBolean = true; //valores tipo vande como un semaforo si esta en fverde puedes continuar
        System.out.println("Valor boolean = "+varBolean);

        if (varBolean) {
            System.out.println("La bandera es verdadera");
        }else {
            System.out.println("La bandera es falsa");
        }

        var edad  = 34;
        //var esAdulto = edad >= 18 ;
       // System.out.println("Edad es: "+esAdulto);

        if (edad >= 18) {
            System.out.println("eres mayor de edad");
        }else {
            System.out.println("eres menor de edad");
        }
    }
}
