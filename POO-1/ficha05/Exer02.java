// Escreva um programa Java para remover um elemento específico de um array.
// o programa simulo uma eliminacao, o seja, apenas oculta o elemento que deve ser eliminado

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arryDeNumeros = {1, 6, 3, 9, 8, 5};
        int qtdDeElementos = arryDeNumeros.length;
        
        System.out.println("Elementos do Array");
        for (int i: arryDeNumeros) {
            System.out.print(i + " ");
        } 

        System.out.print("\nDigite o numero que deseja eliminar: ");
        int numero = input.nextInt();
        int indece;        

        if ((indece = pegarIndice(arryDeNumeros, numero)) != -1) {
            removerElemento(arryDeNumeros, indece);
            qtdDeElementos--;
            System.out.println("Sucesso na remocao");
        } else {
            System.out.println("Elemento nao encontrado");
        }

        for (int i = 0 ; i < qtdDeElementos ; i++)
            System.out.print(arryDeNumeros[i] + " ");
        
        input.close();
    }

    public static int pegarIndice(int[] arry, int numero) {
        for (int i = 0 ; i < arry.length ; i++) {
            if (numero == arry[i])
                return i;
        }
        return -1;
    }
    
    public static void removerElemento(int[] array, int indece) {
        for (int i = indece ; i < array.length - 1 ; i++) {
            array[i] = array[i+1];
        }
    }
}
