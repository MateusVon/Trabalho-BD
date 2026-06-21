package Body;

public class Carta {
    int vida= 1;
    int dano = 0;
    String nome;
    String raridade;

    public Carta(){
       
    }
    public Carta(int vida,int dano,String nome,String raridade){
        this.vida = vida;
        this.dano = dano;
        this.nome = nome;
        this.raridade = raridade;
    }

}
