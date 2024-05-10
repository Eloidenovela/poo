package ficha07.exer4;

public class Aluno {
    private String nome;
    private Disciplina[] disciplinas = new Disciplina[3];

    public Aluno(String nome) {
        this.nome = nome;
        // disciplinas = new Disciplina[3];
    }

    public void setNome(String nome) { this.nome = nome; }

    public void setNotasDisciplina(int index, float nota1, float nota2, float nota3) {
        try {
            disciplinas[index] = new Disciplina(nota1, nota2, nota3);   
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public String getNome() { return nome; }
    
    public void mostrarNotasDisciplina(int index) {
        System.out.println("Nota1\tNota2\tNota3\tMedia");
        //for (int i = 0 ; i < 3 ; i++) {
            System.out.printf("%.2f\t%.2f\t%.2f\t%.2f\n", disciplinas[index].getNota1(), disciplinas[index].getNota2(), disciplinas[index].getNota3(), disciplinas[index].getMedia());
        // }
    }
}
