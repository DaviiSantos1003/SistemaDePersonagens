public class mago extends personagem {



    private int mana;




    public mago(String nome, int nivel, int vida, int mana) {
        super(nome, nivel, vida);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void atacar() {
        IO.println("Bola de fogo");
    }





    public String toString() {
        return "Nome: " + getNome() +
                ", Nível: " + getNivel() +
                ", Vida: " + getVida() +
                ", Mana: " + mana;
    }
}