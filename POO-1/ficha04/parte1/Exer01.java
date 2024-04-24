package ficha04.ficha0101;

import java.util.Scanner;

public class Exer01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String nome1 = "Eloide";
        // String nome2 = "Eloide";
        // System.out.println(nome1.equals(nome2)); // true

        // String nome1 = new String("Eloide");
        // String nome2 = new String("Eloide");
        // System.out.println(nome1); // false

        System.out.print("Digite um numero interio: ");
        int numero = input.nextInt();

        if (numero % 2 == 0){
            System.out.println("O numero " + numero + " eh par");
        } else {
            System.out.println("O numero " + numero + " eh impar");
        }

        input.close();
    }    

    static void andar() {

    }
}
