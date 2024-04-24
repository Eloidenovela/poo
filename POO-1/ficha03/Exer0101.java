// package ficha03;

// Escreva um programa Java que verifica se um número digitado pelo usuário é par ou ímpar.

import java.util.Scanner;

public class Exer0101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();     
        System.out.println((numero % 2 == 0) ? "Par": "Impar"); // --
        input.close();
    }
}
