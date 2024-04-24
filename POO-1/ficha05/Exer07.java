// Escreva um programa Java para testar se um array contém um valor específico

import java.util.Scanner;

public class Exer07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arrayDeNumeros = {2, 44, 6, 9, 11, 13, 77, 17};

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        
        if (existeEsteValorNoArray(arrayDeNumeros, numero)) {
            System.out.println("O numero digitado existe no vector");
        } else {
            System.out.println("Numero nao existe no vector");
        }

        input.close();
    }
    
    public static boolean existeEsteValorNoArray(int[] array, int valor) {

        // o pior caso eh quando o elemento nao esta na array

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] == valor) // busca linear blabla
                return true;
        }

        return false;
    }
}
