package ficha04.ficha0101;

import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float media = 0.0f, nota = 0.0f, somaDasNotas = 0.0f;
        int tentativas = 0; // tentativas de fazer a cadeira

        for (int i = 1 ; i <= 3 ; i++) {
            System.out.print("Digite a " + i + ".o nota: ");
            nota = input.nextFloat();

            if (nota >= 0 && nota <= 20) {
                somaDasNotas += nota;

                if (i == 3) {
                    media = (somaDasNotas / i);

                    if ((media < 10) && (tentativas != 3)) {
                        tentativas++;
                        media = somaDasNotas = i = 0;
                        System.out.println("Reprovado, tens mais " + (3 - tentativas) + " tentivas para fazeres a cadeira");

                    } else if (media >= 10) {
                        System.out.println("Aprovado");
                        break;
                    } else {
                        System.out.println("Estas definitvamente REPROVADO!");
                    }
                }

            } else {
                i--;
                System.out.println("Nota invalida, por favor volte a tentar");
            }
        }

        input.close();
    }    
}
