package terreno;

import java.util.Locale;
import java.util.Scanner;

public class Terreno {
    
    public static void main(String[] args) {

        /*
         * Setando o idioma do programa para US (de forma global) ao invés de Pt-br do sistema.
         */

        Locale.setDefault(Locale.US);

        /*
         * O idioma está em pt-br, então tem que usar vígula ao invés de ponto ao digitar os valores.
         */
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // também garante que o scanner vai estar em US.

        double width;
        double height;
        double valueOfSquareMeter;
        double area;
        double price;

        System.out.println("Digite a largura do terreno: ");
        width = sc.nextDouble();

        System.out.println("Digite o comprimento do terreno: ");
        height = sc.nextDouble();

        System.out.println("Digite o valor do metro quadrado: ");
        valueOfSquareMeter = sc.nextDouble();

        area = width * height;
        price = valueOfSquareMeter * area;

        System.out.println("Area do terreno: " + String.format("%.2f", area));
        System.out.println("Preo do terreno: " + String.format("%.2f", price));

        sc.close();

    }


    

}
