package ficha07.exer3;

public class Room {
    private float altura;
    private float largura;
    private float comprimento;

    public Room(float largura, float altura, float comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }
    
    public float volume() {
        return (largura * altura * comprimento); // volume do retangulo
    }

    public void setAltura(float altura) { this.altura = altura; }
    public void setLargura(float largura) { this.largura = largura; }
    public void setComprimento(float comprimento) { this.comprimento = comprimento; }

    public float getAltura() { return altura; }
    public float getLargura() { return largura; }
    public float getComprimento() { return comprimento; }
}
