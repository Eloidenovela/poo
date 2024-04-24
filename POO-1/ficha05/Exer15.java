// Escreva um programa Java para remover elementos duplicados de um array.

public class Exer15 {
    public static void main(String[] args) {
        int[] arr = {2, 6, 3, 2, 6, 8};
        int tamanho = arr.length;

        for (int i = 0 ; i < tamanho ; i++) {

            for (int l = 0 ; l < i ; l++) {
            
                if (arr[i] == arr[l]) {
                    int indece = 0, valor = arr[i];

                    while ((indece = buscarIndice(arr, valor)) != -1) { // enquanto o valor duplicado no array ainda existir sera eliminado.
                        remover(arr, tamanho, indece);
                        tamanho--; // 
                        i--; 

                        /* linha 18: o deve se i--, para puder-se voltar a verificar se o valor que 
                         * ocupou a posicao do elemento eliminado tambem nao esta ser duplicado
                         */
                    }
                    break;
                }
            }
        }

        for (int i = 0 ; i < tamanho ; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static int buscarIndice(int[] arr, int valor) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (valor == arr[i])
                return i;
        }

        return -1; // valor nao encontrado no array
    }

    public static void remover(int[] arr, int tamanho, int indece) {

        for (int i = indece ; i < tamanho - 1 ; i++) {
            // a posicao do elemento a ser eliminado e ocupado pelo proximo e o proximo tambem e seguido pelo seu proximo...
            arr[i] = arr[i+1];
        }
    } 
}
