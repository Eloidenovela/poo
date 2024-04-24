// Escreva um programa Java para copiar um array iterando o array.

public class Exer08 {
    public static void main(String[] args) {
        int[] arrayOrginal = {2, 7, 6, 8, 5, 99};
        int[] arrayCopia = new int[arrayOrginal.length]; // o array copia deve ter pelo menos o mesmo tamanho do array orginal.

        for (int i = 0 ; i < arrayOrginal.length ; i++) {
            arrayCopia[i] = arrayOrginal[i];
        }
    }
}
