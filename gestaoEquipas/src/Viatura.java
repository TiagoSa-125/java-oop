public class Viatura {
    private String tipoCarro;
    private int nRodas;
    private int veloMax;


    

    public Viatura() {
    }

    
    public Viatura(String tipoCarro, int nRodas, int veloMax) {
        this.tipoCarro = tipoCarro;
        this.nRodas = nRodas;
        this.veloMax = veloMax;
    }


    public String getTipoCarro() {
        return tipoCarro;
    }
    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }
    public int getnRodas() {
        return nRodas;
    }
    public void setnRodas(int nRodas) {
        this.nRodas = nRodas;
    }
    public int getVeloMax() {
        return veloMax;
    }
    public void setVeloMax(int veloMax) {
        this.veloMax = veloMax;
    }

    public void mostraInfo(){
        System.out.println("Vou mostrar a info: ");
        System.out.println("\n  Tipo de carro: "+tipoCarro + "\n  Nº rodas: "+ nRodas + "\n  Velocidade Maxima: "+ veloMax);
    }

}
