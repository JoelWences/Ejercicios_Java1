package Seccion3PrimitiveTypes;

public class Variables {
    public static void main(String args []){
        int miVariableEntera = 10;
        System.out.println(miVariableEntera);
        //modificamos el valor de la variable
        miVariableEntera = 5;
        System.out.println(miVariableEntera);

        String miVariableEnteraCadena = "Saludos";
        System.out.println(miVariableEnteraCadena);

        miVariableEnteraCadena = "Adios";
        System.out.println(miVariableEnteraCadena);

        //Var interferencia de tipos de java
        var miVariableEntera2 = 15;
        System.out.println(miVariableEntera2);

        //Var con cadena
        var miVariableCadena2 = "NuevaCadena";
        System.out.println("mivariabledecadena = " + miVariableCadena2);

        //valores Permitidos
        var miVariable = 1;
        var _mivariable = 2;
        var $mivaribale = 3;
        //No se recomienda variables con tilde
        //No se recomienda utilizar variables con caracteres especiales

    }
}
