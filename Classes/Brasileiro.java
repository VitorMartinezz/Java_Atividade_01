package Classes;

import Interfaces.Humano;

public class Brasileiro extends Pessoa {
    @Override
    public String saudacao(Humano p) {
        return getNome() + ":" + "Olá, tudo bem ?" + "\n" + p.getNome() + ":" + p.responder();
    }
    @Override
    public String responder() {
        return "Oi, Estou bem";
    }  
    public Brasileiro(String nome, int idade) {
        super(nome,idade);
    }
}