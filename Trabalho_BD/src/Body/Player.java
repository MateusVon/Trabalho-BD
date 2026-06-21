package Body;

public class Player {
    int senha;
    String email;
    double pontuacao;
    int partidasJogadas;
    public Player(){
        
    }
    public Player(int senha,int partidasJogadas,String email,double pontuacao){
        this.senha = senha;
        this.partidasJogadas = partidasJogadas;
        this.pontuacao = pontuacao;
        this.email = email;
    }
}
