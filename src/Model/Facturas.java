
package Model;

import java.util.Date;

public class Facturas {
    
    protected String Id;
    protected Date Fecha;
    protected double Total;
    protected double Pago;

    public Facturas(String Id, Date Fecha, double Total, double Pago) {
        this.Id = Id;
        this.Fecha = Fecha;
        this.Total = Total;
        this.Pago = Pago;
    }

    public String getId() {
        return Id;
    }

    public Date getFecha() {
        return Fecha;
    }

    public double getTotal() {
        return Total;
    }

    public double getPago() {
        return Pago;
    }
}
