package ficha04.ficha0101;

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade = 0, qtdDeEstudantes = 0, somaDasIdades = 0, menorIdade = 0, maiorIdade = 0;
        float media = 0.0f;

        for (int i = 1 ;; i++) {
            System.out.print("Digite a idade do estudante: ");
            idade = input.nextInt();

            if (idade >= 18 && idade <= 70) {
                // lnha 17: na 1.o iteracao assume-se que a maior e a menor idade e a 1.o idade a ser inserida.
                if (i == 1)
                    maiorIdade = menorIdade = idade;
                
                if (idade > maiorIdade) {
                    maiorIdade = idade;
                } else if (idade < menorIdade) {
                    menorIdade = idade;
                }
                qtdDeEstudantes++;
                somaDasIdades += idade;
            } else {
                System.out.println("Idade invalida, bye");
                break;
            }
        }

        media = (somaDasIdades / (qtdDeEstudantes));
        System.out.println("A menor e a maior idade sao: " + menorIdade + " " + maiorIdade + ", respectivamnte");
        System.out.println("A media das idades eh: " + media);
        input.close();


        // while (idade >= 0) {
        //     System.out.print("Digite a idade do estudante: ");
        //     idade = input.nextInt();
        //     if (qtdDeEstudantes == 0)
        //         menorIdade = maiorIdade = idade;

        //     if (idade >= 18) {
        //         if (idade > maiorIdade) {
        //             maiorIdade = idade;
        //         } else if (idade < menorIdade) {
        //             menorIdade = idade;
        //         }
        //         qtdDeEstudantes++;
        //     }
        // }

        // for (int i = 1 ;; i++) {
        //     System.out.print("Digite a idade do estudante: ");
        //     idade = input.nextInt();
        //     if (idade <= 0) break;

        //     if (idade >= 0 && idade < 18) {
        //         System.out.println("Idade invalida");
        //         i--;
        //     } else {
        //         somaDasIdades += idade;
        //         qtdDeEstudantes++;
        //         switch (i) {
        //             case 1:
        //                 // na 1.o iteracao assume-se que a 1.o idade a ser inserida e a maior. 
        //                 maiorIdade = idade;
        //                 break;
        //             case 2:
        //                 // objetivo dese case e pegar a menor idade.
        //                 if (idade > maiorIdade) {
        //                     int aux = maiorIdade;
        //                     maiorIdade = aux;
        //                     menorIdade = aux;
        //                 } else {
        //                     menorIdade = idade;
        //                 }
        //                 break;
        //             default:

        //                 if (idade > maiorIdade) {
        //                     maiorIdade = idade;
        //                 } else if (idade < menorIdade) {
        //                     menorIdade = idade;
        //                 }
        //                 break;
        //         }
        //     }
        // }
    }    
}
