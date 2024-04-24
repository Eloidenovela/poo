// Escreva um programa Java para encontrar o valor máximo e mínimo de um array.

public class Exer09 {
    public static void main(String[] args) {
        int[] valores = {18, 7, 6, 6, 55, 9, 19};
        int valorMinimo = 0, valorMaximo = 0;

        valorMaximo = valorMinimo = valores[0]; // assumindo primeiramente que os valores maximos e minimos sao o 1.o elemento do vector
        
        for (int i = 0 ; i < valores.length ; i++) {
            if (valores[i] > valorMaximo) {
                valorMaximo = valores[i];
            }

            if (valores[i] < valorMinimo) {
                valorMinimo = valores[i];
            }
        }

        System.out.println("Max: " + valorMaximo + "\nMin: " + valorMinimo);

    } 
}
