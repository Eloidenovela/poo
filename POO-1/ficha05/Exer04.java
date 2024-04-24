// Escreva um programa Java para somar os valores de um array.

public class Exer04 {

    public static void main(String[] args) {
        int[] arrayDeNumeros = {1, 4, 7, 3, 2, 9};
        int somaDeValores = 0;
        String valores = "";
     
        for (int elemento : arrayDeNumeros) {
            somaDeValores += elemento;
            valores += elemento + " ";
        }

        System.out.println("A soma dos valores [" + valores + "] eh: " + somaDeValores);
    }

    @Override
    public String toString() {
        return "Exer04 []";
    }
}
