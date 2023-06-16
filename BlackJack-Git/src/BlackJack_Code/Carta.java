package BlackJack_Code;
public class Carta {
    
    private String idCarta;
    private String naipeCarta;

    public Carta(String idCarta, String naipeCarta) {
        this.idCarta = idCarta;
        this.naipeCarta = naipeCarta;
    }

   
    
    public int valorDaCarta(){
        if(idCarta.equals("a")){
            return 11;
        }
        else if(idCarta.equals("j")){
            return 10;
        }
        else if(idCarta.equals("q")){
            return 10;
        }
        else if(idCarta.equals("k")){
            return 10;
        }
        //Convertendo o número de ID da carta para int e retornando como valor.
        return Integer.parseInt(idCarta);
    }

    @Override
    public String toString() {
        return idCarta + naipeCarta;
    }
    

    
    
    
    
}
