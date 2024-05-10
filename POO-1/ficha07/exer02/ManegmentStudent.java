package ficha07.exer02;

import java.lang.NullPointerException;
import java.lang.IndexOutOfBoundsException;
public class ManegmentStudent {

    private static Student[] listaDeAlunos = new Student[100];
    private static int numeroDeAlunos;

    public static int getNumeroDeAlunos() { return numeroDeAlunos; }

    public static void adicionarAluno(String nomeCompleto, int idade, int serie) {
        try {
            listaDeAlunos[numeroDeAlunos] = new Student(nomeCompleto, idade, serie);
            numeroDeAlunos++;
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void atualizarInfoAluno(int index, String novoNome, int novaIdade, int novaSerie) {
        try {
            listaDeAlunos[index].setNomeCompleto(novoNome);
            listaDeAlunos[index].setIdade(novaIdade);
            listaDeAlunos[index].setSerie(novaSerie);

        } catch (NullPointerException e) {
            System.err.println(e.getMessage());

        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } 
    }

    public static void atualizarInfoAluno(int index, String novoNome) {
        try {
            listaDeAlunos[index].setNomeCompleto(novoNome);

        } catch (NullPointerException e) {
            System.err.println(e.getMessage());

        } catch (IndexOutOfBoundsException e) {
            
            System.err.println(e.getMessage());
        }
    }

    public static void atualizarInfoAluno(int index, String novoNome, int novaIdade) {
        try {
            listaDeAlunos[index].setIdade(novaIdade);
            listaDeAlunos[index].setNomeCompleto(novoNome);
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {

            System.err.println(e.getMessage());
        }
    }

    public static void atualizarInfoAluno(int index, int novaSerie) {
        try {
            listaDeAlunos[index].setSerie(novaSerie);

        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {

            System.err.println(e.getMessage());
        }
    }


    // buscar
    public static int buscarAluno(String nomeCompleto) {
        try {
            for (int i = 0 ; i < numeroDeAlunos ; i++) {
                if (listaDeAlunos[i].getNomeCompleto().equalsIgnoreCase(nomeCompleto)) {
                    return i;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {

            System.err.println(e.getMessage());
        }

        return -1;
    }
    
    public static int buscarAluno(int id) {
        try {
            for (int i = 0 ; i < numeroDeAlunos ; i++) {
                if (listaDeAlunos[i].getId() == id) {
                    return i;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {
            System.err.println(e.getMessage());
        }
        return -1;
    }

    public static void mostrarInfoAluno(int index) {
        try {
            System.out.printf("%d\t%s\t%d\t%d\n", listaDeAlunos[index].getId(), listaDeAlunos[index].getNomeCompleto(), listaDeAlunos[index].getIdade(), listaDeAlunos[index].getSerie());

        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (NullPointerException e) {

            System.err.println(e.getMessage());
        }
    }

    public static void mostrarTodosAlunos() {
        System.out.println("id\tNome completo\tIdade\tSerie");

        for (int i = 0 ; i < getNumeroDeAlunos() ; i++) {
            mostrarInfoAluno(i);
        }
    }
}
