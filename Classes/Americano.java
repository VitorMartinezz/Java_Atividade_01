package Classes;

import Interfaces.Humano;

public class Americano extends Pessoa{
    @Override
    public String saudacao(Humano p) {
        return getNome() + ":" + "Hello, How are you ?" + "\n" + p.getNome() + ":" + p.responder();
    }
    @Override
    public String responder() {
        return "I'm fine thanks";
    }  
    public Americano(String nome, int idade) {
        super(nome,idade);
    }
}