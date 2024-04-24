package ficha03;

import java.util.Scanner;

public class Exer0211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int somaDeImpares = 0, qtdDeImpares = 0, numero = input.nextInt();
        float mediaDeImpares = 0.0f;
        
        for (int i = 1 ; i <= numero ; i++) {
            if (!(i % 2 == 0)) {
                somaDeImpares += i;  
                qtdDeImpares++;
            }
        }

        mediaDeImpares = (somaDeImpares / qtdDeImpares);
        System.out.println("A media dos impares de 1 ate " + numero + " eh: " + mediaDeImpares);

        input.close();
    }
    
}
