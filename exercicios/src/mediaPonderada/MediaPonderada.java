package mediaPonderada;

import java.util.Locale;
import java.util.Scanner;

public class MediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int qtdDeCasos = 3;
        double mediaPonderada;

        System.out.print("Quantos casos você vai digitar? ");
        qtdDeCasos = teclado.nextInt();

        for (int i = 0; i < qtdDeCasos; i++) {
            System.out.println("Digite tres números: ");
            double num1 = teclado.nextDouble();
            double num2 = teclado.nextDouble();
            double num3 = teclado.nextDouble();

            mediaPonderada = ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5);

            System.out.printf("MEDIA = %.1f%n", mediaPonderada);

        }

        teclado.close();
    }
}
