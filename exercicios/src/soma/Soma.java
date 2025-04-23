package soma;

import java.util.Locale;
import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int X;
        int Y;
        int sum;

        System.out.println("Digite o valor de X: ");
        X = scanner.nextInt();

        System.out.println("Digite o valor de Y: ");
        Y = scanner.nextInt();

        sum = X + Y;

        System.out.printf("SOMA = %d", sum);

        scanner.close();
    }


}