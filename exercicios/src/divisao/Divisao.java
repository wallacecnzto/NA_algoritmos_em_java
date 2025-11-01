package divisao;

import java.util.Locale;
import java.util.Scanner;

public class Divisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int qtdDeCasos;
        double divisao = 0;

        System.out.print("Quantos casos você vai digitar: ");
        qtdDeCasos = teclado.nextInt();

        for(int i = 0; i < qtdDeCasos; i++) {
            System.out.print("Entre com o numerador: ");
            double numerador = teclado.nextInt();
            System.out.print("Entre com o denominador: ");
            double denominador = teclado.nextInt();

            if (denominador == 0) {
                System.out.println("DIVISAO IMPOSSIVEL");
            } else {
                divisao = numerador / denominador;
                System.out.printf("DIVISAO = %.2f%n", divisao);
            }
        }

        teclado.close();
    }
}
