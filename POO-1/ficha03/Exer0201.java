package ficha03;

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
