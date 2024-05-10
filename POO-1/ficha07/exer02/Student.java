package ficha07.exer02;

@SuppressWarnings("static-access")

public class Student {
    private String nomeCompleto;
    private int id;
    private int serie;
    private int idade;
    private static int idDaClasse = 100;
    
    public Student() {
        this.id = idDaClasse;
        this.idDaClasse++;
    }

    public Student(String nomeCompleto, int idade, int serie) {
        this.nomeCompleto = nomeCompleto;
        this.idade = idade;
        this.serie = serie;
        this.id = idDaClasse;
        this.idDaClasse++;
    }
    
    // setters
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public void setIdade(int idade) { this.idade = idade; }
    public void setSerie(int serie) { this.serie = serie; }

    // getters
    public String getNomeCompleto() { return nomeCompleto; }
    public int getIdade() { return idade; }
    public int getSerie() { return serie; }
    public int getId() { return id; }
}
