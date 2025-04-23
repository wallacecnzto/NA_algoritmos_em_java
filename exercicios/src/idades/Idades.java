package idades;

import java.util.Locale;
import java.util.Scanner;

public class Idades {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);     

        String nameOfFirstPerson;
        String nameOfSecondPerson;
        int ageOfFirstPerson;
        int ageOfSecondPerson;
        double middleAge;

        System.out.println("Dados da primeira:");
        System.out.println("Nome: ");
        nameOfFirstPerson = scanner.nextLine();
        System.out.println("Idade: ");
        ageOfFirstPerson = scanner.nextInt();

        System.out.println("Dados da segunda pessoa:");
        System.out.println("Nome: ");
        scanner.nextLine(); // Limpeza de buffer
        nameOfSecondPerson = scanner.nextLine();
        System.out.println("Idade: ");
        ageOfSecondPerson = scanner.nextInt();
        
        middleAge = (ageOfFirstPerson + ageOfSecondPerson) / 2.0;

        System.out.printf("A idade media de %s e %s é de %.1f anos.",   nameOfFirstPerson, nameOfSecondPerson, middleAge);

        scanner.close();

    }
}
