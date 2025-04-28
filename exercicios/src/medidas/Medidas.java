package medidas;

import java.util.Locale;
import java.util.Scanner;

public class Medidas {
    
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double medidaA;
        double medidaB;
        double medidaC;
        double areaDoQuadrado;
        double areaDoTriangulo;
        double areaDoTrapezio;

        System.out.println("Digite a medida de A: ");
        medidaA = scanner.nextDouble();

        System.out.println("Digite a medida de B: ");
        medidaB = scanner.nextDouble();

        System.out.println("Digite a medida de C: ");
        medidaC = scanner.nextDouble();

        areaDoQuadrado = medidaA * medidaA;
        areaDoTriangulo = (medidaA * medidaB) / 2;
        areaDoTrapezio = (medidaA + medidaB) * (medidaC / 2);

        System.out.printf("AREA DO QUADRADO = %.4f\n", areaDoQuadrado);
        System.out.printf("AREA DO TRIANGULO = %.4f\n", areaDoTriangulo);
        System.out.printf("AREA DO TRAPEZIO = %.4f\n", areaDoTrapezio);

        scanner.close();

    }
}
