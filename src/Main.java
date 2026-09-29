void main() {



    personagem personagem1 = new personagem("Edgar", 11, 6600);
    mago personagem2 = new mago("Ziggy", 11, 5600, 3);
    guerreiro personagem3 = new guerreiro("Nori", 11, 7600, 2200);



    IO.println(personagem1);
    personagem1.atacar();

    IO.println(personagem2);
    personagem2.atacar();

    IO.println(personagem3);
    personagem3.atacar();
}