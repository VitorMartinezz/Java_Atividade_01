package Classes;

import Interfaces.Humano;

public class Japones extends Pessoa{

    @Override
    public String saudacao(Humano p) {
        return getNome() + ":" + "こんにちは、元気ですか" + "\n" + p.getNome() + ":" + p.responder(); 
    }

    @Override
    public String responder() {
        return "大丈夫です";
    }

    public Japones(String nome, int idade) {
        super(nome, idade);
    }
    
}