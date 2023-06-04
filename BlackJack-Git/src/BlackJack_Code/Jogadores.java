package BlackJack_Code;

import java.util.ArrayList;
import java.util.List;


public class Jogadores {
    private List<Carta> baralhoDeCartas;
    public Jogadores(){
        baralhoDeCartas= new ArrayList();
    }
    
    public void adicionarCarta(Carta novaCarta){
        baralhoDeCartas.add(novaCarta);
    }
    
    public int valorDaMão(){
        int pontuação=0;
        int ás=0;
        
        //Lógica para fazer o Ás valer 1 ao invés de 10.
        for(Carta carta:baralhoDeCartas){
            pontuação+=carta.valorDaCarta();
            if(carta.valorDaCarta()==11){
                ás++;
            }
        }
        
        while(pontuação>21 && ás>0){
            pontuação-=10;
            ás--;
        }
        
        return pontuação;
    }
    
    
}
