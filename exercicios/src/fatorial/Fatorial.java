package fatorial;

import java.util.Locale;
import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        // N == N×(N−1)×(N−2)×...×2×1

        int fatorial = 1;

        System.out.print("Digite o valor de N: ");
        int n = teclado.nextInt();

        if (n == 0) {
            System.out.println("FATORIAL = 1");
        } else {
            for (int i = 1; i <= n; i++) {
                fatorial *= i; // a multiplicação vai de 1 até o valor de N
            }

            System.out.println("FATORIAL = " + fatorial);
        }

        teclado.close();
    }
}

/***
 * USANDO O LOOP FOR DECREMENTANDO O VALOR DE I
 * 
 * import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int n = sc.nextInt();

        int fatorial = 1;

        for (int i = n; i >= 1; i--) {
            fatorial *= i;  // multiplica de n até 1
        }

        System.out.println("O fatorial de " + n + " é " + fatorial);

        sc.close();
    }
}

 * 
 */