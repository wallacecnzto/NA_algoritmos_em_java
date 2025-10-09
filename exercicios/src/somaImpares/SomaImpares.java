package somaImpares;

import java.util.Locale;
import java.util.Scanner;

/*
 * Problema "soma_impares" (adaptado de URI 1071)
Leia 2 valores inteiros X e Y (em qualquer ordem). A seguir, calcule e mostre a soma dos números
impares entre eles.
 */

public class SomaImpares {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        int y;
        int somaEntreImpares = 0;

        System.out.println("Digite dois números: ");
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = x; i < y; i++) {
            if (x % 2 != 0) {
                somaEntreImpares += x + 1;
            }
        }

        System.out.printf("SOMA DOS ÍMPARES = %d\n", somaEntreImpares);

        sc.close();
    }

}
