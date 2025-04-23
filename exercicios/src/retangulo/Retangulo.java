package retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Retangulo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        
        double base;
        double altura;
        double area;
        double perimetro;
        double diagonal;

        System.out.println("Base do retangulo:");
        base = scanner.nextDouble();

        System.out.println("Altura do retangulo: ");
        altura = scanner.nextDouble();
        
        area = base * altura;
        perimetro = 2 * (base + altura);
        diagonal = Math.sqrt((base * base) + (altura * altura));

        System.out.printf("AREA = %.4f\n", area);
        System.out.printf("PERIMETRO = %.4f\n", perimetro);
        System.out.printf("DIAGONAL = %.4f\n", diagonal);
        
        scanner.close();

    }
}
