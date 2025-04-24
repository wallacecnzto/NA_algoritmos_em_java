package circulo;

import java.util.Locale;
import java.util.Scanner;

public class Circulo {
    
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raio;
        double area;

        System.out.println("Digite o valor do raio do circulo: ");
        raio = scanner.nextDouble();

        area = Math.PI * Math.pow(raio, 2);

        System.out.printf("AREA = %.3f", area);

        scanner.close();
    }
}
