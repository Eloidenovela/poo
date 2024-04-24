// Escreva um programa Java para encontrar o índice de um elemento de array

import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] provinciasDeMocambique = {"Maputo", "Gaza", "Sofala", "Manica", "Tete", "Gaza", "Zambezia", "Niassa"};
       
        System.out.println("Algumas provincias de Mocambique");
        for (String provincia: provinciasDeMocambique) {
            System.out.println(provincia);
        }

        System.out.print("\nDigite o nome de uma provincia: ");
        String provincia = input.nextLine();
        String indices = "";

        for (int i = 0 ; i < provinciasDeMocambique.length ; i++) {
            if (provinciasDeMocambique[i].toUpperCase().equals(provincia.toUpperCase())) {
                
                indices += ", " + i; // caso em que o elemento esteja repetido no array
            }
        }

        System.out.println("O indece(s) de " + provincia + " eh" + indices);
        
        input.close();    
    }    
}
