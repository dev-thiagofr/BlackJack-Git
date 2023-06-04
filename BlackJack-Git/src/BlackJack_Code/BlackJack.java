package BlackJack_Code;
public class BlackJack {
    private Baralho baralhodoJogo;
    private Jogadores dealer;
    private Jogadores player;
    
    public BlackJack(){
        baralhodoJogo = new Baralho();
        //baralhodoJogo.embaralhar();
        
        dealer = new Jogadores();
        player = new Jogadores();
        
    }
    public void Jogo(){
        //Formação da mão inicial;
        player.adicionarCarta(baralhodoJogo.compraCarta());
        dealer.adicionarCarta(baralhodoJogo.compraCarta());
        
        player.adicionarCarta(baralhodoJogo.compraCarta());
        dealer.adicionarCarta(baralhodoJogo.compraCarta());
    }
    
    public void resultados(){
        int pPontos = player.valorDaMão();
        int dPontos = dealer.valorDaMão();
        
        if(pPontos>21){
            System.out.println("Você estourou , o dealer ganha");
        }
        else if(dPontos>21){
            System.out.println("Que sorte! O dealer estourou , voce ganhou!");
        }
        else if(dPontos>pPontos){
            System.out.println("O dealer ganhou!");
        }
        else if(dPontos<pPontos){
            System.out.println("Você venceu!");
        }
        else{
            System.out.println("Empate.");
        }
        
    }
}
