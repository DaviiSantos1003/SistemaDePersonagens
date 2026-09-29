public class guerreiro extends personagem {


    private int forca;




    public guerreiro(String nome, int nivel, int vida, int forca) {
        super(nome, nivel, vida);
        this.forca = forca;
    }



    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public void atacar() {
        IO.println("o guerreiro atacou");
    }


    public String toString() {
        return "Nome: " + getNome() +
                ", Nível: " + getNivel() +
                ", Vida: " + getVida() +
                ", Força: " + forca;
    }
}