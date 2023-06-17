package BlackJack_Code;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Baralho {
    private List<Carta> cartas;
    
    public Baralho(){
        String[] naipes = {"espadas", "coração", "ouros", "paus"};
        String[] ids = {"a", "2", "3", "4", "5", "6", "7", "8", "9", "10", "j", "q", "k"};
        cartas = new ArrayList<>();
    
        for(String naipeCarta:naipes){
            for(String idCarta:ids){
            Carta unidadeCarta= new Carta(idCarta,naipeCarta);
            cartas.add(unidadeCarta);
            }
        }
    
    }
    
    public void embaralhando(){
        Random numR = new Random();
        for(int i= cartas.size() - 1; i>0;i--){
            int j= numR.nextInt(i+1);
            Carta cartaTemporaria = cartas.get(i);
            cartas.set(i, cartas.get(j));
            cartas.set(j, cartaTemporaria);
        }
    }
    
    public Carta comprar(){
        if(cartas.isEmpty()){
            return null;
        }
        return cartas.remove(cartas.size() - 1);
    }
}