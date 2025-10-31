package bee1070;

import java.util.Locale;
import java.util.Scanner;

public class BEE1070 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int inicio = teclado.nextInt();

        if (inicio % 2 == 0) {
            inicio++;
        }

        for (int cont = 1; cont <= 6; cont++) {
            System.out.println(inicio);
            inicio+= 2;
        }

        teclado.close();
        
    }

}
