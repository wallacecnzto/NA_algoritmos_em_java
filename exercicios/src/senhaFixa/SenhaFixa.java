package senhaFixa;

/*
* Problema "senha_fixa" (adaptado de URI 1114)
Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de
senha incorreta informada, escrever a mensagem "Senha Invalida! Tente novamente:". Quando a senha
for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo
encerrado. Considere que a senha correta é o valor 2002.
* */

import java.util.Locale;
import java.util.Scanner;

public class SenhaFixa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        final int PASSWORD = 2002;
        int userPassword;

        System.out.println("Digite a senha: ");
        userPassword = sc.nextInt();

        while (userPassword != PASSWORD) {
            System.out.println("Senha invalida! Tente novamente: ");
            userPassword = sc.nextInt();
        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
