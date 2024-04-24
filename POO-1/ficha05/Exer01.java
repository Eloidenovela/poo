
// Escreva um programa Java para classificar um array numérico e um array de strings.

public class Exer01 {
    
    public static void main(String[] args) {
        int[] arrayDeNumeros = {1, 5, 10, 9};
        String[] arrayDeStrings = {"Analise Math", "Algebra", "Computacao", "Engenharia", "Matematica", "Algoritmos"};
        
        ordenarArrayDeNumerico(arrayDeNumeros);
        ordenarArrayDeSrings(arrayDeStrings);

        for (int i: arrayDeNumeros) {
            System.out.print(i + " ");
        }
        
        System.out.println();

        for (String a: arrayDeStrings) {
            System.out.print(a + " ");
        }
    }

    public static void ordenarArrayDeNumerico(int[] arrayDeNumeros) {
        // esta algoritmo acha o menor elemento da array e coloca na primeira posicao e assim sucessivamente
        
        for (int i = 0 ; i < arrayDeNumeros.length ; i++) {
            
            int menorValor = arrayDeNumeros[i];
            for (int j = i ; j < arrayDeNumeros.length ; j++) {

                if (arrayDeNumeros[j] < menorValor ) {
                    int aux = arrayDeNumeros[j];
                    arrayDeNumeros[j] = menorValor;
                    menorValor = aux;
                }
            }
            arrayDeNumeros[i] = menorValor;
        }
    }

    public static void ordenarArrayDeSrings(String[] arrayDeStrings) {
        
        for (int i = 0 ; i < arrayDeStrings.length ; i++) {
            int l = 0; // percorre carater-por-caracter da string
            
            for (int j = i ; j < arrayDeStrings.length - 1 ; j++) {
            
                if (arrayDeStrings[j].charAt(l) > arrayDeStrings[j+1].charAt(l)) {

                    String aux = arrayDeStrings[j];
                    arrayDeStrings[j] = arrayDeStrings[j+1];
                    arrayDeStrings[j+1] = aux;
                    l = 0; // as proximas strings sao comparadas nos seus primeiros caracteres. 

                } else if (arrayDeStrings[j].charAt(l) == arrayDeStrings[j+1].charAt(l)) {
                    l++; // caso os caracterer das strings sejam iguais, acessa o segundo carater das strings.
                    j--; // para voltar a comparar as duas strings.
                }
            }
        }
    }
}
