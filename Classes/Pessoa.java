package Classes;
import Interfaces.Humano;

abstract class Pessoa implements Humano{

    public String nome;
    public int idade; 
    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String saudacao(Humano p) {
        return "";
    }

    @Override
    public String responder() {
        return "";
    }

    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    
}