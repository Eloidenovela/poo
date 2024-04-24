package ficha04.ficha0101;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o salario do funcionario: ");
        float salario = input.nextFloat();
        float novoSalario = 0.0f, bonusSalario = salario * 0.3f;

        novoSalario = salario + (salario * 0.1f) + bonusSalario;
        System.out.println("O novo salario, com aumento de 10% e um bonus de 30% eh: " + novoSalario);

        input.close();
    }
    
}
