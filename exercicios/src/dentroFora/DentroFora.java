package dentroFora;

import java.util.Locale;
import java.util.Scanner;

public class DentroFora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int qtdDigitada;
        int dentro = 0;
        int fora = 0;
        int num;

        System.out.print("Quantos números você vai digitar? ");
        qtdDigitada = teclado.nextInt();

        for (int i = 0; i < qtdDigitada; i++) {
            System.out.println("Digite um número: ");
            num = teclado.nextInt();
            if (num >= 10 && num <= 20) {
                dentro++;
            } else {
                fora++;
            }
        }

        System.out.printf("%d DENTRO\n", dentro);
        System.out.printf("%d FORA\n", fora);

        teclado.close();
    }
}
