package ficha04.ficha0101;

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero interio: ");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("O numero " + numero + " eh positivo");
        } else {
            System.out.println("O numero " + numero + " eh negativo");
        }

        input.close();
    }    
}
