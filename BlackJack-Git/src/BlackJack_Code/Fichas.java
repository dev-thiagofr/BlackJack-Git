package BlackJack_Code;

public class Fichas {
    private int qtn_fichas;

    
    public Fichas(int qtn_fichas) {
        this.qtn_fichas = qtn_fichas;
    }
    
    public void qtn_venceu(){
        qtn_fichas=+qtn_fichas+50;
    }
    
    public void qtn_perdeu(){
        qtn_fichas=+qtn_fichas-25;
    }

    public int getQtn_fichas() {
        return qtn_fichas;
    }

    public void setQtn_fichas(int qtn_fichas) {
        this.qtn_fichas = qtn_fichas;
    }

    @Override
    public String toString(){
        return "Sua quantidade de fichas é: "+qtn_fichas; 
    
    
}
}