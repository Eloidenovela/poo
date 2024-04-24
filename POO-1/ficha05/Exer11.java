// // Escreva um programa Java para encontrar valores duplicados em uma matriz de valores inteiros.

// public class Exer11 {
//     public static void main(String[] args) {
//         int[][] matriz = {
//             {1, 2, 4, 1, 6, 2}, 
//             {1, 3, 5, 1, 6}, 
//             {8, 5, 4, 88, 8}, 
//             {1, 2, 3, 2, 9}
//         };

//         System.out.println("Valores duplicados na matriz");

//         for (int j = 0 ; j < matriz.length ; j++) {
//             String duplicados = "";

//             for (int i = 0 ; i < matriz[j].length ; i++) {

//                 for (int l = 0 ; l < i ; l++) {

//                     if (matriz[j][i] == matriz[j][l]) {
//                         duplicados += matriz[j][i] + " ";
//                         break;
//                     }
//                 }
//             }
            
//             System.out.println("Na linha " + (j+1) +": " + duplicados);
//         }

//         for (int j = 0 ; j < matriz.length ; j++) { // linhas: 4

//             for (int i = 0 ; i < matriz[j].length ; i++) { // colunas
//                 String duplicados = "";
//                 for (int l = 0 ; l < matriz.length ; l++) {
                    
//                     if (matriz[j][i] == matriz[l][i]) {
//                         duplicados += matriz[j][i] + " ";
//                         break;
//                     }
//                 }

//                 System.out.println("Na coluna " + (i+1) +": " + duplicados);
//             }
//         }
//     }    
// }
