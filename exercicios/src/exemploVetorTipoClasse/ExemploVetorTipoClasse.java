package exemploVetorTipoClasse;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class ExemploVetorTipoClasse {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int number = teclado.nextInt();
        Product[] vector = new Product[number];

        for (int i = 0; i < vector.length; i++) {
            teclado.nextLine();
            String name = teclado.nextLine();
            double price = teclado.nextDouble();
            vector[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i = 0; i < vector.length; i++) {
            sum += vector[i].getPrice();
        }

        double average = sum / vector.length;

        System.out.printf("AVERAGE PRICE = %.2f%n", average);

        teclado.close();
    }
}
