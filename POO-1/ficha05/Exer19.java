/*
 * Escreva um programa Java para encontrar todos os pares de elementos em um array cuja soma 
 * seja igual a um número especificado.
 */

import java.util.Scanner;

public class Exer19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {5, 6, 8, 4, 7, 3};
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        for (int i = 0 ; i < arr.length ; i++) {
            for (int j = 0 ; j < arr.length ; j++) {
                if ((arr[i] + arr[j])  == numero) {
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }

        input.close();
    }
}
