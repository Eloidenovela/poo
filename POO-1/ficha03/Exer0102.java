package ficha03;

import java.util.Scanner;

public class Exer0102 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero = 0, maior = 0;

        for (int i = 1 ; i <= 3 ; i++) {
            System.out.print("Digite um numero: ");
            numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior digitado eh: " + maior);
        input.close();
    }
    
}
