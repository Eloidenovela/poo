// package ficha03;

/*
 * Escreva um programa Java que lê um número inteiro e imprime o maior divisor desse número.
 * 1
 */

 // apresento aqui duas abordagens para resolucao do mesmo problema
import java.util.Scanner;

public class Exer0212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt(), maiorDivisor = 1;
       
        // System.out.println("O maior divisor do numero "+ numero + " eh: " + numero); // o maior div de um numero e o proprio numero
        
        // 1.o abordagem
        for (int i = 2 ; i <= numero / 2 ; i++) {
            if (numero % i == 0) {
                if (i > maiorDivisor) {
                    maiorDivisor = i;
                }
            }
        }


        // 2.o abordagem by Cebola Zacarias
        // for (int i = (numero / 2) ; i >= 2 ; i--) {
        //     if (numero % i == 0) {
        //         maiorDivisor = i;
        //         break;
        //     }
        // }

        System.out.println("O maior divisor de " + numero + " alem de ele mesmo eh: " + maiorDivisor);

        input.close();
    }
    
}
