public class App {
    public static void main(String[] args) throws Exception {
        

        Viatura carro = new Viatura();

        carro.setTipoCarro("Carro Desportivo");
        carro.setnRodas(6);
        carro.setVeloMax(350);

        carro.mostraInfo();
    }
}
