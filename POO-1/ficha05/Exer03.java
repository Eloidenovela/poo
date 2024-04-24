// Escreva um programa Java para inserir um elemento (posição específica) em um array.

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arryDeNumeros = new int[10];
        int posicao = 0, numero = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = input.nextInt();
            System.out.println("Escolhe uma posicao que deseja inserir esse numero de [1 a 10]: ");
            posicao = input.nextInt();
    
            if (posicao > 0 && posicao <= 10) {
                arryDeNumeros[posicao - 1] = numero; // insercao na posicao especifica
                System.out.println("sucesso na insercao");
  
            } else 
                System.out.println("Posicao invalida!");

        } while (!(posicao > 0 && posicao <= 10));

        input.close();
    }    
}