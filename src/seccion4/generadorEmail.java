package seccion4;

public class generadorEmail {
    public static void main(String[] args) {

        var nombreUsuario = "Joel Bejar Espinoza";
        var resutado1 = nombreUsuario.toLowerCase().replace(" ", ".");
        System.out.println("Nombre del usuario = " + resutado1);

        var nombreEmpresa = "Tismar Belcorp";
        var nombreDominio = ".com.pe";
        nombreEmpresa = nombreEmpresa.replace(" ", ".");
        var resultado2 = new StringBuffer();
        resultado2.append("@").append(nombreEmpresa.toLowerCase()).append(nombreDominio);
        System.out.println("Dominio = " + resultado2);

        var correo =  resutado1 + resultado2.toString() ;
        System.out.println("correo = " + correo);





    }
}
