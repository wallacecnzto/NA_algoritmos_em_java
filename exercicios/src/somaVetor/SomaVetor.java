package somaVetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        double soma = 0;
        double media = 0;

        System.out.println("Quantos números você vai digitar? ");
        int qtdNumeros = teclado.nextInt();

        double[] vetorDeNumeros = new double[qtdNumeros];

        for (int i = 0; i < vetorDeNumeros.length; i++) {
            System.out.println("Digite um número: ");
            vetorDeNumeros[i] = teclado.nextDouble();
        }

        System.out.print("VALORES = ");

        for (int i = 0; i < vetorDeNumeros.length; i++) {
            System.out.print(vetorDeNumeros[i] + " ");
        }

        for (double valor: vetorDeNumeros) {
            soma += valor;
        }

        media = soma / vetorDeNumeros.length;

        System.out.println();
        System.out.printf("SOMA = %.2f%n", soma);
        System.out.printf("MEDIA = %.2f", media);

        teclado.close();
    }
}
