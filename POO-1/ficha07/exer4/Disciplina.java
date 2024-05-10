package ficha07.exer4;

public class Disciplina {
    private float[] notas = new float[3];
    private float media;
    public Disciplina(float nota1, float nota2, float nota3) {
        this.notas[0] = nota1;
        this.notas[1] = nota2;
        this.notas[2] = nota3;
    }

    public void setNota1(float nota1) { notas[0] = nota1; }

    public void setNota2(float nota2) { notas[1] = nota2; }

    public void setNota3(float nota3) { notas[2] = nota3; }

    public float getNota1() { return notas[0]; }
    public float getNota2() { return notas[1]; }
    public float getNota3() { return notas[2]; }

    public float getMedia() { 
        media = ((notas[0]+ notas[1] + notas[2]) / 3);
        return media; 
    }
}
