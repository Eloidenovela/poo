package ficha03;
import java.util.Scanner;
public class Exer0107 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] produtos = {"Tomate", "Cebola", "Alface"};
        float preco = 0.0f, menor_preco = 0.0f;
        int i = 0, l = 0;

        for (int j = 0 ; j < 3 ; j++) {
            System.out.printf("Digite o preco de %s: ", produtos[j]);
            preco = input.nextFloat();

            if (preco == menor_preco) {
                l++;
               
            }

            if (j == 0) {
                menor_preco = preco;
            }

            if (menor_preco > preco) {
                i++;
                menor_preco = preco;

            }
        }

        System.out.println((l == 0) ? "O produto mais barato e: " + produtos[i] : "Alguns produto sao os mais barator ou nenhum e mais barato");

        input.close();
    }
    
}
