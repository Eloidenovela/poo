package ficha03;

import java.util.Scanner;

public class Exer0203 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();

        for (int i = 1 ; i <= 12 ; i++) 
            System.out.println(numero + " * " + i + " = " + (numero * i));

        input.close();
    }
    
}
