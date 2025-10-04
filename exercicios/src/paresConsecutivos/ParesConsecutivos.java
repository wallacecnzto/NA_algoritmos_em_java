package paresConsecutivos;

/*
* Problema "pares_consecutivos" (adaptado de URI 1159)
O programa deve ler um valor inteiro X indefinidas vezes. (O programa irá parar quando o valor de X
for igual a 0). Para cada X lido, imprima a soma dos 5 pares consecutivos a partir de X, inclusive o X
, se for par. Se o valor de entrada for 4, por exemplo, a saída deve ser 40, que é o resultado da operação:
4+6+8+10+12, enquanto que se o valor de entrada for 11, por exemplo, a saída deve ser 80, que é a
soma de 12+14+16+18+20.
* */

import java.util.Locale;
import java.util.Scanner;

public class ParesConsecutivos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        int soma;

        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();

        while (x != 0) {
            if (x % 2 == 0) {
                soma = x;
                int contador = 1;
                while (contador < 6) {
                    soma += x + 2;
                    contador += 1;
                }
            } else {
                soma = x + 1;
                int contador = 1;
                while (contador < 6) {
                    soma += x + 2;
                    contador += 1;
                }
            }
            System.out.printf("SOMA = %d", soma);

            System.out.println("Digite um número inteiro: ");
            x = sc.nextInt();
        }



        sc.close();
    }
}
