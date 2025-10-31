package sequenciaImpares;

import java.util.Locale;
import java.util.Scanner;

public class SequenciaImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int x;
        
        System.out.print("Digite o valor de X: ");
        x = teclado.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        teclado.close();
    }
}
