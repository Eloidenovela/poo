package ficha04.ficha0102;
import java.util.Scanner;

import javax.security.sasl.SaslException;

public class Exer03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int anos = 0, numCigarroDia = 0, quantidadeDeCigarros = 0;
        float precoCarteira = 0.0f, valorGasto = 0.0f;
        
        System.out.print("Digite o numero de anos: ");
        anos = input.nextInt();
        
        System.out.print("Digite o preco por carteira: ");
        precoCarteira = input.nextFloat();
        
        System.out.print("Digite a quatidade de cigarros por carteiras: ");
        quantidadeDeCigarros = input.nextInt();
        
        System.out.print("Digite o numero de cigarros fumados por dia: ");
        numCigarroDia = input.nextInt();

        valorGasto = ((numCigarroDia * (365 * anos)) / quantidadeDeCigarros) * precoCarteira;
        System.out.println("O valor gasto pelo fumante em " + anos + " anos eh: " + valorGasto + " mt");
        input.close();
    }
    
}
