// package ficha03;

/*
 * Escreva um programa Java que lê um número inteiro e imprime a sequência de Fibonacci até esse
 * número.
 */

import java.util.Scanner;

public class Exer0207 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long anterior = 0, posterior = 1, proximo = 1;
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        while (proximo <= numero) {
            System.out.print(proximo + " ");
            proximo = anterior + posterior;
            anterior = posterior;
            posterior = proximo;
        }

        // do {
        //     System.out.print(proximo + " ");
        //     proximo = anterior + posterior;
        //     anterior = posterior;
        //     posterior = proximo;
        // } while (proximo <= numero);

        // for (int i = 1 ; i <= numero ; i++) {
        //     System.out.print(proximo + " ");
        //     proximo = anterior + posterior;
        //     anterior = posterior;
        //     posterior = proximo;
        // }

        input.close();
    }
}
