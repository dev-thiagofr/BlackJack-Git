package BlackJack_Code;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Baralho {
    //Criação da lista de objetos com os baralhos.
    private List<Carta> baralhoDeCartas;

    public void criarBaralho(){
        //Copas, Ouros, Espadas , Paus
        String[] naipes={"c","o","e","´p"};
        String[] ids={"a","2","3","4","5","6","7","8","9","10","j","q","k"};
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
    //Não sei como embaralhar ainda
    public void embaralhar(){
        
    }
    public Carta compraCarta() {
        return baralhoDeCartas.remove(baralhoDeCartas.size()-1);
    }
    public List<Carta> getBaralhoDeCartas() {
        return baralhoDeCartas;
    }

    public void setBaralhoDeCartas(List<Carta> baralhoDeCartas) {
        this.baralhoDeCartas = baralhoDeCartas;
    }



    
    
    
    
}
