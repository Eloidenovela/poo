package ficha04.ficha0101;

public class Exer06 {
    public static void main(String[] args) {
        int divisores = 0, somaDePrimos = 0, qtdDePrimos = 0, numero = 0;
        String numerosPrimos = new String();
        
        while (qtdDePrimos != 5) {
            divisores = 1;
            for (int i = 1 ; i <= numero / 2 ; i++) {
                if (numero % i == 0) {
                    divisores++;
                }

                if (divisores > 2) {
                    break;
                }
            }

            if (divisores == 2) {
                somaDePrimos += numero;
                numerosPrimos += (" " + numero);
                qtdDePrimos++;
            }

            numero++;
        }
        
        System.out.println("A soma dos 5 primeiros primos(" + numerosPrimos + ") eh: " + somaDePrimos);
    }
}
