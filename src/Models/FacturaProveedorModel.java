package Models;


import Models.Facturas;
import Models.ProveedorModel;
import java.util.Date;

public class FacturaProveedorModel extends Facturas{
    
    private ProveedorModel Proveedor;
    
    public FacturaProveedorModel(String Id, Date Fecha, int Cantidad, double Total, ProveedorModel Proveedor) {
        super(Id, Fecha, Cantidad, Total);
        this.Proveedor = Proveedor;
    }

    public ProveedorModel getProveedor() {
        return Proveedor;
    }
}
