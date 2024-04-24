// Escreva um programa Java para reverter uma matriz de valores inteiros.

public class Exer10 {
    public static void main(String[] args) {
        int[][] matriz = {
            {8, 5, 7}, 
            {88, 77, 489}, 
            {88, 555, 43, 727, 829}
        };

        System.out.println("Matriz Original");
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[i].length ; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }

        for (int j = 0 ; j < matriz.length ; j++) {
            int tamanho = matriz[j].length - 1;

            for(int i = 0 ; i < matriz[j].length / 2 ; i++) {
            
                int aux = matriz[j][i];
                matriz[j][i] = matriz[j][tamanho - i];
                matriz[j][tamanho - i] = aux;
            }
        }
        
        System.out.println("Ja invertido");
        for (int i = 0 ; i < matriz.length ; i++) {
            for (int j = 0 ; j < matriz[i].length ; j++) {
                System.out.print(matriz[i][j] + " ");
            }

            System.out.println();
        }
    }
}
