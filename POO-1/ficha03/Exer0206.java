package ficha03;

import java.util.Scanner;

public class Exer0206 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long fat = 1;// o um elemento neutro

        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        // for (int i = 1 ; i <= numero ; i++) {
        //     fat *= i; // 1*2*...*numero;
        // }

        while (numero != 0) {
            fat *= (numero--);
        }

        System.out.print("O fatorial de " + numero + " e: " + fat);

        input.close();
    }

    public static int fatorial(int numero) {
        return (numero == 0) ? 1 : numero * fatorial(numero - 1);
    }
    
}
