package BlackJack_Code;

import java.util.ArrayList;
import java.util.List;



public class Jogadores {
    private List<Carta> cartas;
    
    public Jogadores(){
        cartas= new ArrayList<>();
    }
    
    public void adicionarCarta(Carta novaCarta){
        cartas.add(novaCarta);
    }
    
    public int valorDaMão(){
        int pont=0;
        int ás=0;
        
        //Lógica para fazer o Ás valer 1 ao invés de 10.
        for(Carta carta:cartas){
            pont+=carta.valorDaCarta();
            if(carta.valorDaCarta()==11){
                ás++;
            }
        }
        
        while(pont>21 && ás>0){
            pont-=10;
            ás--;
        }
        
        return pont;
    }
   
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Carta carta:cartas){
            sb.append(carta.toString()).append(",");
        }
        return sb.toString();
    }
    
}
