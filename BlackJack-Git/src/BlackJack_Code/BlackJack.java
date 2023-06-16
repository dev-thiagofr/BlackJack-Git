package BlackJack_Code;

import java.util.Scanner;

public class BlackJack {
    private Baralho baralhodoJogo;
    private Jogadores dealer;
    private Jogadores player;
    
    public BlackJack(){
        baralhodoJogo = new Baralho();
        baralhodoJogo.embaralhando();
        
        dealer = new Jogadores();
        player = new Jogadores();
        
    }
    public void Jogo(){
        System.out.println("Bem vindo ao BlackJack");
        //Formação da mão inicial;
        player.adicionarCarta(baralhodoJogo.comprar());
        dealer.adicionarCarta(baralhodoJogo.comprar());
        
        player.adicionarCarta(baralhodoJogo.comprar());
        dealer.adicionarCarta(baralhodoJogo.comprar());
        
        turnoJogador();
        turnoDealer();
        
        resultados();
    }
    
    private void turnoJogador(){
        Scanner tlc = new Scanner(System.in);
        boolean turnoM=true;
        while(turnoM){
            System.out.println("Mão do jogador:"+player);
            System.out.println("Valor da mão:"+player.valorDaMão());
            
            if(player.valorDaMão()>21){
                System.out.println("Estourou");
                turnoM=false;
            }
            
            System.out.println("1-Puxar / 2- Parar");
            int verifica = tlc.nextInt();
            if(verifica==1){
                player.adicionarCarta(baralhodoJogo.comprar());
            }
            else{
                turnoM=false;
            }
        }
   }
    
    private void turnoDealer(){
        boolean contagem=true;
        while(contagem){
            if(dealer.valorDaMão()<17){
                dealer.adicionarCarta(baralhodoJogo.comprar());
            }
        }
        
        System.out.println("Mão do Dealer: "+dealer);
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
