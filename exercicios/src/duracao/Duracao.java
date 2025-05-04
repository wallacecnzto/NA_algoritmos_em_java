package duracao;

import java.util.Locale;
import java.util.Scanner;

public class Duracao {
    
    public static void main(String args[] ) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int hours;
        int minutes;
        int seconds;
        int duration;
        int rest;

        /*
         * 1 min = 60 segundos
         * 1 hora = 60 minutos
         * ou
         * 1 hora = 60 * 60 = 3600 segundos
         */

        System.out.println("Digite a duração em segundos: ");
        duration = scanner.nextInt();

        hours = duration / 3600; // obtem as horas
        rest = duration % 3600; // obtem o resto para continuar
        minutes = rest / 60; // obtem os minutos
        seconds = rest % 60; // o que sobra já é os segundos!

        System.out.println(hours + ":" + minutes + ":" + seconds);

        scanner.close();
    }
}
