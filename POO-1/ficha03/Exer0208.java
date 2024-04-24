package ficha03;

import java.util.Scanner;

public class Exer0208 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int div = 0;
        // int n = 123;

        // for (int i = 1; i <= n ; i++) {
        //     if (n % i == 0){
        //         System.out.print(i + " ");
        //         div++;
        //     }
        // }

        // System.out.println(div == 2);


        input.close();
    }

    public static boolean ehPrimo(int numero) {
        // pior caso, quando o numero eh primo
        int divisores = 1; // contando ja com o proprio numero.
        for (int i = 1 ; i <= numero / 2 ; i++) {

            if (numero % i == 0) {
                divisores++;
            }

            if (divisores > 2) {
                return false;
            }
        }

        return true;
    }
    
}
