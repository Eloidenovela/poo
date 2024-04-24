// package ficha03;

/*
 *  Escreva um programa Java que lê um número inteiro e imprime a média dos números de 1 a esse
 *  número.
 */

 import java.util.Scanner;

public class Exer0205 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int soma = 0, numero = input.nextInt();

        for (int i = 1 ; i <= numero ; i++) {
            soma += i;
        }

        System.out.println((int)'m');
        System.out.println("A media dos numeros de 1 a " + numero + " e " + ((float)soma / (float)numero));
        
        input.close();
    }
    
}
