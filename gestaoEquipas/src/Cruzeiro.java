public class Cruzeiro extends Barco {
    private int nQuartos;
    private int nPisos;
    private String nomeBarco;
    

    
    public Cruzeiro() {
        this.nQuartos = 0;
        this.nPisos = 0;
        this.nomeBarco = "";
    }

    public Cruzeiro(int nQuartos, int nPisos, String nomeBarco) {
        this.nQuartos = nQuartos;
        this.nPisos = nPisos;
        this.nomeBarco = nomeBarco;
    }

    public int getnQuartos() {
        return nQuartos;
    }

    public void setnQuartos(int nQuartos) {
        this.nQuartos = nQuartos;
    }

    public int getnPisos() {
        return nPisos;
    }

    public void setnPisos(int nPisos) {
        this.nPisos = nPisos;
    }

    public String getNomeBarco() {
        return nomeBarco;
    }

    public void setNomeBarco(String nomeBarco) {
        this.nomeBarco = nomeBarco;
    }
    
    public void mostraInfoCruzeiro(){
        //Este super chama a funcao que esta em barco
        super.mostraInfo();
        System.out.println( "Cruzeiro nQuartos=" + nQuartos + ", nPisos=" + nPisos + ", nomeBarco=" + nomeBarco );
 
        
    }

    
}
