package troco;

import java.util.Locale;
import java.util.Scanner;

public class Troco {
        
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double priceUnit;
        int amount;
        double moneyReceived;
        double change;

        System.out.println("Preço initário do produto: ");
        priceUnit = scanner.nextDouble();

        System.out.println("Quantidade comprada: ");
        amount = scanner.nextInt();

        System.out.println("Dinheiro recebido: ");
        moneyReceived = scanner.nextDouble();

        change = moneyReceived - (priceUnit * amount);

        System.out.printf("TROCO = %.2f", change);

        scanner.close();
    }

}
