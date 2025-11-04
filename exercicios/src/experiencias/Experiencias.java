package experiencias;

import java.util.Locale;
import java.util.Scanner;

public class Experiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int qtdDeCasosDeTeste = 0;
        int qtdDeCobaias = 0;
        char tipoDeCobaia;
        int totalDeCobaias = 0;
        int totalDeCoelhos = 0;
        int totalDeRatos = 0;
        int totalDeSapos = 0;
        double percentualDeCoelhos = 0.0;
        double percentualDeRatos = 0.0;
        double percentualDeSapos = 0.0;

        System.out.print("Quantos casos de teste serão digitados? ");
        qtdDeCasosDeTeste = teclado.nextInt();

        for (int i = 0; i < qtdDeCasosDeTeste; i++) {
            System.out.print("Quantidade de cobaias: ");
            qtdDeCobaias = teclado.nextInt();
            System.out.print("Tipo de cobaia: ");
            tipoDeCobaia = teclado.next().charAt(0);

            totalDeCobaias += qtdDeCobaias;

            if (tipoDeCobaia == 'C') {
                totalDeCoelhos += qtdDeCobaias;
            } else if (tipoDeCobaia == 'R') {
                totalDeRatos += qtdDeCobaias;
            } else {
                totalDeSapos += qtdDeCobaias;
            }

        }

        percentualDeCoelhos = (double) totalDeCoelhos / totalDeCobaias * 100;
        percentualDeRatos = (double) totalDeRatos / totalDeCobaias * 100;
        percentualDeSapos = (double) totalDeSapos / totalDeCobaias * 100;

        System.out.println("");
        System.out.println("RELATÓRIO FINAL:");

        System.out.println("Total: " + totalDeCobaias + " cobaias");
        System.out.println("Total de coelhos: " + totalDeCoelhos);            
        System.out.println("Total de ratos: " + totalDeRatos);
        System.out.println("Total de sapos: " + totalDeSapos);

        System.out.printf("Percentual de coelhos: %.2f%n", percentualDeCoelhos);
        System.out.printf("Percentual de ratos: %.2f%n", percentualDeRatos);
        System.out.printf("Percentual de sapos: %.2f%n", percentualDeSapos);

        teclado.close();
    }
}
