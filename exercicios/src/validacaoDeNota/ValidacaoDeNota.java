package validacaoDeNota;

/*
* Problema "validacao_de_nota" (adaptado de URI 1117)
Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a
média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao
intervalo [0,10]). Cada nota deve ser validada separadamente.
* */

import java.util.Locale;
import java.util.Scanner;

public class ValidacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double primeiraNota;
        double segundaNota;
        double mediaSemestral;
        int qtdeAvaliacoes = 2;

        System.out.println("Digite a primeira nota: ");
        primeiraNota = sc.nextDouble();

        while (primeiraNota < 0 || primeiraNota > 11) {
            System.out.println("Valor inválido! Tente novamente: ");
            primeiraNota = sc.nextDouble();
        }

        System.out.println("Digite a segunda nota: ");
        segundaNota = sc.nextDouble();

        while (segundaNota < 0 || segundaNota > 10) {
            System.out.println("Valor inválido! Tente novamente: ");
            segundaNota = sc.nextDouble();
        }

        mediaSemestral = (primeiraNota + segundaNota) / qtdeAvaliacoes;

        System.out.printf("MEDIA = %.2f", mediaSemestral);

        sc.close();
    }
}
