package Model;


import Model.Facturas;
import Model.Proveedor;
import java.util.Date;

public class FacturaProveedor extends Facturas{
    
    private Proveedor Proveedor;
    
    public FacturaProveedor(String Id, Date Fecha, int Cantidad, double Total, Proveedor Proveedor, double Pago) {
        super(Id, Fecha, Cantidad, Total, Pago);
        this.Proveedor = Proveedor;
    }

    public Proveedor getProveedor() {
        return Proveedor;
    }
}
