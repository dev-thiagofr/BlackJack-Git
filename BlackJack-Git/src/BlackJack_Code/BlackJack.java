package BlackJack_Code;

import java.util.Scanner;

public class BlackJack {
    private Baralho baralhodoJogo;
    private Jogadores dealer;
    private Jogadores player;
    
    public BlackJack(){
        baralhodoJogo = new Baralho();
        baralhodoJogo.embaralhar();
        
        dealer = new Jogadores();
        player = new Jogadores();
        
    }
    public void Jogo(){
        //Formação da mão inicial;
        player.adicionarCarta(baralhodoJogo.compraCarta());
        dealer.adicionarCarta(baralhodoJogo.compraCarta());
        
        player.adicionarCarta(baralhodoJogo.compraCarta());
        dealer.adicionarCarta(baralhodoJogo.compraCarta());
        
        turnoJogador();
        turnoDealer();
        
        resultados();
    }
    
    private void turnoJogador(){
        Scanner tlc = new Scanner(System.in);
        boolean parar =true;
        while(parar){
            System.out.println("Mão do jogador:"+player.toString());
            System.out.println("Valor da mão:"+player.valorDaMão());
            
            if(player.valorDaMão()>21){
                System.out.println("Estourou");
                parar=false;
            }
            System.out.println("1-Puxar / 2- Parar");
            int verifica = tlc.nextInt();
            if(verifica==1){
                player.adicionarCarta(baralhodoJogo.compraCarta());
            }
            else{
                parar=false;
            }
        }
        
        
    }
    private void turnoDealer(){
        boolean contagem=true;
        while(contagem){
            if(dealer.valorDaMão()<17){
                dealer.adicionarCarta(baralhodoJogo.compraCarta());
            }
        }
        
        System.out.println("Mão do Dealer: "+dealer.toString());
        System.out.println("Valor: "+dealer.valorDaMão());
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
