public class personagem {




    private String nome;
    private int nivel;
    private int vida;





    public personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        setNivel(nivel);
        setVida(vida);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        if (nivel >= 1) {
            this.nivel = nivel;
        } else {
            this.nivel = 1;
        }
    }

    public int getVida() {
        return vida;
    }





    public void setVida(int vida) {
        if (vida >= 0 && vida <= 100) {
            this.vida = vida;
        } else if (vida < 0) {
            this.vida = 0;
        } else {
            this.vida = 100;
        }
    }

    public void atacar() {
        IO.println("Ataquee");
    }

    public String toString() {
        return "Nome: " + nome +
                ", Nível: " + nivel +
                ", Vida: " + vida;
    }
}