
package Models;

import java.util.ArrayList;
import java.util.Date;

public class FacturaProductoModel extends Facturas{
    
    private ArrayList<ProductoModel> Productos = new ArrayList<>();
    
    public FacturaProductoModel(String Id, Date Fecha, int Cantidad, double Total, ArrayList<ProductoModel> Productos) {
        super(Id, Fecha, Cantidad, Total);
        this.Productos =  (ArrayList<ProductoModel>) Productos.clone();
    }

    public ArrayList<ProductoModel> getProductos() {
        return Productos;
    }
    
}
