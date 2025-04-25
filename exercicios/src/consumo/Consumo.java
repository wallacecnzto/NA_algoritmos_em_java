package consumo;

import java.util.Locale;
import java.util.Scanner;

public class Consumo {
    
    public static void main(String [] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int distandeTraveled;
        double fuelSpent;
        double averageConsumption;

        System.out.println("Distancia percorrida: ");
        distandeTraveled = scanner.nextInt();

        System.out.println("Combustível gasto: ");
        fuelSpent = scanner.nextDouble();

        averageConsumption = distandeTraveled / fuelSpent;

        System.out.printf("Consumo medio = %.3f", averageConsumption);

        scanner.close();
    }



}
