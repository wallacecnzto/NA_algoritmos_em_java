package pagamento;

import java.util.Locale;
import java.util.Scanner;

public class Pagamento {
    
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nameOfEmployee;
        double valueOfHour;
        int workedHour;
        double payment;

        System.out.println("Nome: ");
        nameOfEmployee = scanner.nextLine();

        System.out.println("Valor por hora: ");
        valueOfHour = scanner.nextDouble();

        System.out.println("Horas trabalhadas: ");
        workedHour = scanner.nextInt();

        payment = valueOfHour * workedHour;

        System.out.printf("O pagamento para %s deve ser de %.2f", nameOfEmployee, payment);

        scanner.close();

    }
}
