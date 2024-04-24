package ficha04.ficha0101;

public class Exer05 {
    public static void main(String[] args) {
        int somaDosNegativos = 0;
        for (int i = -10 ; i < 0 ; i++) {
            somaDosNegativos += i;
            System.out.print(i + " ");
        }

        System.out.print("= " + somaDosNegativos);
    }    
}
