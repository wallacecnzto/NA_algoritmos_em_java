package bee1064;

import java.util.Locale;
import java.util.Scanner;

public class BEE1064 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        float valor;
        float media = 0;
        int numPos = 0;

        for (int i = 1; i <= 6; i++) {
            valor = teclado.nextFloat();
            if (valor > 0) {
                media = media + valor;
                numPos++;
            }
        }

        System.out.println(numPos + " valores positivos");
        System.out.printf("%.1f\n", (media / numPos));


        teclado.close();
    }
}
