package mediaIdades;

/*
* Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez,
mostrar a mensagem "IMPOSSIVEL CALCULAR".
* */

import java.util.Locale;
import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int count = 0;
        int age;
        double sum = 0;
        double average = 0;

        System.out.println("Digite as idades: ");
        age = sc.nextInt();

        if (age < 0) {
            System.out.println("IMPOSSÍVEL CALCULAR");
        } else {
            while (age > 0) {
                sum += age;
                count++;
                age = sc.nextInt();
            }
            average = sum / count;
        }

        System.out.printf("MEDIA = %.2f", average);

        sc.close();
    }
}
