// package ficha03;

// Escreva um programa Java que imprime os números de 1 a 10.

public class Exer0201 {
    public static void main(String[] args) {
        String u = new String();
        for (int i = 1 ; i <= 10 ; i++) {
            System.out.print(i + " ");
            u += i;
        }

        System.out.println(u.charAt(0));
    }
    
}
