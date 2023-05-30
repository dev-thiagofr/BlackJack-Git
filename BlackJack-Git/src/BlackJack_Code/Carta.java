package BlackJack_Code;
public class Carta {
    private String naipeCarta;
    private String idCarta;

    public Carta(String naipeCarta, String idCarta) {
        this.naipeCarta = naipeCarta;
        this.idCarta = idCarta;
    }
    
    public int valorDaCarta(){
        if(idCarta.toLowerCase().equals("a")){
            return 11;
        }
        else if(idCarta.toLowerCase().equals("j")){
            return 10;
        }
        else if(idCarta.toLowerCase().equals("q")){
            return 10;
        }
        else if(idCarta.toLowerCase().equals("k")){
            return 10;
        }
        //Convertendo o número de ID da carta para int e retornando como valor.
        return Integer.parseInt(idCarta);
    }

    public String getNaipeCarta() {
        return naipeCarta;
    }

    public String getIdCarta() {
        return idCarta;
    }

    public void setNaipeCarta(String naipeCarta) {
        this.naipeCarta = naipeCarta;
    }

    public void setIdCarta(String idCarta) {
        this.idCarta = idCarta;
    }
    
    
    
    
}
