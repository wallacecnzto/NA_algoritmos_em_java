package parImpar;

import java.util.Locale;
import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar: ");
        int qtdDigitada = teclado.nextInt();

        for (int i = 0; i < qtdDigitada; i++) {
            System.out.print("Digite um número: ");
            int numeroDigitado = teclado.nextInt();

            if (numeroDigitado == 0) {
                System.out.println("NULO");
            } else if (numeroDigitado % 2 == 0 && numeroDigitado > 0) {
                System.out.println("PAR POSITIVO");
            } else if (numeroDigitado % 2 == 0 && numeroDigitado < 0) {
                System.out.println("PAR NEGATIVO");
            } else if (numeroDigitado % 2 != 0 && numeroDigitado > 0) { // em Java, pode haver resto negativo (-1)!
                System.out.println("IMPAR POSITIVO");
            } else {
                System.out.println("IMPAR NEGATIVO ");
            }
        }

        teclado.close();
    }
}
