package BlackJack_Code;

import java.util.List;
import java.util.ArrayList;

public class Baralho {
    //Criação da lista de objetos com os baralhos.
    private List<Carta> baralhoDeCartas;
    
    public void criarBaralho(){
        String[] naipes={"Copas","Ouros","Damas","Paus"};
        String[] ids={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        baralhoDeCartas = new ArrayList<>();
        
        /*
        Um for é para acessar o naipe e o outro para acessar a carta
        Igual usamos para adicionar elementos numa matriz mas aqui 
        usando os parametros da classe Carta.java.
        */
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
