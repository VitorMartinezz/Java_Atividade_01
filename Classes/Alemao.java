package Classes;

import Interfaces.Humano;

public class Alemao extends Pessoa{
    @Override
    public String saudacao(Humano p) {
        return getNome() + ":"+"hallo, Wie gehts dir ?" + "\n" + p.getNome() + ":" + p.responder();
    }

    @Override
    public String responder() {
        return "Es geht mir gut.";
    }
    public Alemao(String nome, int idade) {
        super(nome,idade);
    }
}