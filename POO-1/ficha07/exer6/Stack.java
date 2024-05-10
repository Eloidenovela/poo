package ficha07.exer6;

/**
 * Stack
 */
public class Stack {

    private int[] array;
    private int numeroDeElementos;

    public Stack(int capacity) {
        array = new int[capacity];
        numeroDeElementos = 0;
    }

    public void push(int elemento) {
        array[numeroDeElementos] = elemento;
        numeroDeElementos++;
    }

    public int pop() {
        numeroDeElementos--;

        if (numeroDeElementos >= 0)
            return array[numeroDeElementos];
        System.out.print("Nao tem mais elementos: ");

        return -1;
    }
}
