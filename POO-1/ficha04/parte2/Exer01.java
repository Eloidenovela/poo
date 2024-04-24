package ficha04.ficha0102;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();
        System.out.println(++numero);
        input.close();
    }
    
}
