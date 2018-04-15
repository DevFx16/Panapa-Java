
package Model;

import java.io.Serializable;
import java.util.Calendar;

public class Facturas implements Serializable{
    
    protected String Id;
    protected Calendar Fecha;
    protected double Total;
    protected double Pago;

    public Facturas(String Id, Calendar Fecha, double Total, double Pago) {
        this.Id = Id;
        this.Fecha = Fecha;
        this.Total = Total;
        this.Pago = Pago;
    }

    public String getId() {
        return Id;
    }

    public Calendar getFecha() {
        return Fecha;
    }

    public double getTotal() {
        return Total;
    }

    public double getPago() {
        return Pago;
    }
}
