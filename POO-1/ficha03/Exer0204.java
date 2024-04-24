// package ficha03;

/*
    Escreva um programa Java que lê um número inteiro e imprime a soma dos números de 1 a esse
    número.
*/  

import java.util.Scanner;

public class Exer0204 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int soma = 0, numero = input.nextInt();

        for (int i = 1 ; i <= numero ; i++) {
            soma += i;
        }

        System.out.println("A soma de numeros de 1 a " + numero + " e: " + soma);

        input.close();
        
    }
    
}
