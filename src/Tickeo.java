public class Tickeo {
    String humano;
    Integer suben;
    Integer bajan;
    Autobus autobus;
    Parada parada;
    //metodo constructor

    public Tickeo(String humano, Integer sube, Integer bajan, Autobus autobus, Parada parada) {
        this.humano = humano;
        this.suben = sube;
        this.bajan = bajan;
        this.autobus = autobus;
        this.parada = parada;
    }
}
