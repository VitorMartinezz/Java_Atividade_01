import Classes.Alemao;
import Classes.Americano;
import Classes.Brasileiro;
import Classes.Japones;

public class Exercicio_1 {
    public static void main(String[] args) {
        Brasileiro brasileiro = new Brasileiro("fabio", 26);
        Americano americano = new Americano("James", 24);
        Alemao alemao = new Alemao("Albert", 66);
        Japones japones = new Japones("Subaru",17);

        System.out.println(alemao.saudacao(americano));
        System.out.println();
        System.out.println(americano.saudacao(alemao));
        System.out.println();
        System.out.println(brasileiro.saudacao(japones));
        System.out.println();
        System.out.println(japones.saudacao(brasileiro));
    }
    
}