package BlackJack_Code;

import java.util.List;
import java.util.ArrayList;

public class Baralho {
    private List<Carta> baralhoDeCartas;
    
    public void criarBaralho(){
        String[] naipes={"Copas","Ouros","Damas","Paus"};
        String[] ids={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        baralhoDeCartas = new ArrayList<>();
        
        for(String naipeCarta:naipes){
            for(String idCarta:ids){
                Carta cartaDoBaralho = new Carta(naipeCarta,idCarta);
                baralhoDeCartas.add(cartaDoBaralho);
            }
        }
        
    }

    public List<Carta> getBaralhoDeCartas() {
        return baralhoDeCartas;
    }

    public void setBaralhoDeCartas(List<Carta> baralhoDeCartas) {
        this.baralhoDeCartas = baralhoDeCartas;
    }
    
    
    
    
}
