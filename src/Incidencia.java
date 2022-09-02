import java.util.Date;

public class Incidencia {
    Date fecha;
    Double costo;
    String tipo;
    //Metodo constructor

    public Incidencia(Date fecha, Double costo, String tipo) {
        this.fecha = fecha;
        this.costo = costo;
        this.tipo = tipo;
    }
}
