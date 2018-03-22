package Controller;

import Model.FacturaProducto;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductoFacturaController {
    
    ArrayList<FacturaProducto> Lista_Factura = new ArrayList<>();

    public void Create(FacturaProducto Factura) {
        Lista_Factura.add(Factura);
    }

    public ArrayList<FacturaProducto> Read(String Filter) {
        ArrayList<FacturaProducto> Get = new ArrayList<>();
        Iterator<FacturaProducto> it = Lista_Factura.iterator();
        while (it.hasNext()) {
            FacturaProducto current = (FacturaProducto) it.next();
            if (current.getId().contains(Filter)) {
                Get.add(current);
            }
        }
        return Get;
    }

    public void Update (int Index, FacturaProducto Factura){
        Lista_Factura.set(Index, Factura);
    }
    
    public void Delete (int Index){
        Lista_Factura.remove(Index);
    }
    
    public ArrayList<FacturaProducto> getLista_Factura() {
        return Lista_Factura;
    }
    
}
