// package ficha03;

// Escreva um programa Java que lê um número inteiro e imprime o fatorial desse número.
// neste documento, exponho algumas abordagem que vieram a cabeca..

import java.util.Scanner;

public class Exer0206 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long fat = 1;// o um elemento neutro

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        // for (int i = 1 ; i <= numero ; i++) {
        //     fat *= i; // 1*2*...*numero; // 1.o abordagem
        // }

        while (numero != 0) {
            fat *= (numero--); // 2.o abordagem
        }

        System.out.print("O fatorial de " + numero + " e: " + fat);

        input.close();
    }

    public static int fatorial(int numero) {
        return (numero == 0) ? 1 : numero * fatorial(numero - 1); // 3.o abordagem
    }
    
}
