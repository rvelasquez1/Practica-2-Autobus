import java.util.List;

public class Linea {
    String nombre;
     List<Autobus> autibuses;
    List<Parada> Parada;
    //metodo constructor


    public Linea(String nombre, List<Autobus> autibuses, List<Parada> parada) {
        this.nombre = nombre;
        this.autibuses = autibuses;
        Parada = parada;
    }
}
