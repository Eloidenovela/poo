package ficha03;

import java.util.Scanner;

public class Exer0212 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt(), maiorDivisor = 1;
       
        // System.out.println("O maior divisor do numero "+ numero + " eh: " + numero);
        
        for (int i = 2 ; i <= numero / 2 ; i++) {
            if (numero % i == 0) {
                if (i > maiorDivisor) {
                    maiorDivisor = i;
                }
            }
        }

        System.out.println("O maior divisor de " + numero + " alem de ele mesmo eh: " + maiorDivisor);

        input.close();
    }
    
}
