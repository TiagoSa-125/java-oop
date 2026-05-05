public class Barco extends Viatura {
    private boolean temPiscina;

    public Barco() {
        super("Barco", 0, 0);
    }

    public boolean isTemPiscina() {
        return temPiscina;
    }

    public void setTemPiscina(boolean temPiscina) {
        this.temPiscina = temPiscina;
    }
    @Override
    public void mostraInfo(){
        System.out.println("Vou mostrar a info do barco: ");
        System.out.println("\n  Tipo de barco: "+getTipoCarro() + "\n  Nº rodas: "+ getnRodas() + "\n  Velocidade Maxima: "+ getVeloMax());
        if(temPiscina){
            System.out.println("Tem piscina");
        }else{ 
            System.out.println("Não tem Piscina");
        }
        
    }
}
