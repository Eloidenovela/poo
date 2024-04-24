// package ficha03;

/*
 * Escreva um programa Java que lê um número inteiro e imprime a média dos números ímpares entre
 * 1 e esse número.
 */

import java.util.Scanner;

public class Exer0211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int somaDeImpares = 0, qtdDeImpares = 1, numero = input.nextInt();
        float mediaDeImpares = 0.0f;
        
        for (int i = 2 ; i <= numero ; i++) {
            if (!(i % 2 == 0)) {
                somaDeImpares += i;  
                qtdDeImpares++;
            }
        }

        mediaDeImpares = (somaDeImpares / qtdDeImpares);
        System.out.println("A media dos impares de 1 ate " + numero + " eh: " + mediaDeImpares);

        input.close();
    }
    
}
