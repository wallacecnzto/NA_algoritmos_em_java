package negativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int qtdDeNumeros;

        System.out.println("Quantos números você vai ditigar? ");
        qtdDeNumeros = teclado.nextInt();
        
        // Criando um array
        int[] vetor = new int[qtdDeNumeros];

        // Populando o array
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número: ");
            vetor[i] = teclado.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");

        // Varrendo o array, fazendo a verificação e printando (modo clássico, usando índice e valor).
        // for (int i = 0; i < vetor.length; i++) {
        //     if (vetor[i] < 0) {
        //         System.out.println(vetor[i]);
        //     }
        // }

        // Varrendo o array, fazendo a verificação e printando
        // Usando o for each (usado quando NÃO precisamos usar o índice e manipular diretamente o valor)
        for (int elemento: vetor) {
            if (elemento < 0) {
                System.out.println(elemento);
            }
        }

        teclado.close();
    }
}
