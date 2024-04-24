package ficha03;
import java.util.Scanner;

public class Exer0101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = input.nextInt();     
        System.out.println((numero % 2 == 0) ? "Par": "Impar");
        input.close();
    }
}
