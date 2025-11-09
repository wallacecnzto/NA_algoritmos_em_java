package exemploVetorTipoValor;

import java.util.Locale;
import java.util.Scanner;

public class ExemploVetorTipoValor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        int number = teclado.nextInt();
        double[] vector = new double[number]; // declaro o vetor do tipo double, instanciando e definindo o tamanho number dele.

        for (int i = 0; i < number; i++) {
            vector[i] = teclado.nextDouble(); // percorro e vou adicionando em cada posição vector[i] o valor do i do loop.
        }

        double sum = 0.0;

        for (int i = 0; i < number; i++) {
            sum += vector[i]; // percorro e vou acumulando o valor que tem no vector[i] na variável sum.
        }

        double average = sum / number;

        System.out.printf("AVERAGE HEIGHT: %.2f%n", average);

        teclado.close();
    }
}
