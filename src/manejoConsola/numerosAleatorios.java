package manejoConsola;

import java.util.Random;

public class numerosAleatorios {
    public static void main(String[] args) {
        System.out.println("**** Numeros aleatorios ****");
        var random = new Random();

        var numeroAleatorio = random.nextInt(10);
        System.out.println("numero aleatorio es: " + numeroAleatorio);

        numeroAleatorio = random.nextInt(10)+1;
        System.out.println("numero aleatorio entre 1-10 : " + numeroAleatorio);

        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotante aleatorio es: " + flotanteAleatorio);

        var dado = random.nextInt(6)+1;
        System.out.println("resultado dado: " + dado);

    }
}
