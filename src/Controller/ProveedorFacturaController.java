package Controller;

import Model.FacturaProveedor;
import java.util.ArrayList;
import java.util.Iterator;

public class ProveedorFacturaController {

    ArrayList<FacturaProveedor> Lista_Factura = new ArrayList<>();

    public void Create(FacturaProveedor Factura) {
        Lista_Factura.add(Factura);
    }

    public ArrayList<FacturaProveedor> Read(String Filter) {
        ArrayList<FacturaProveedor> Get = new ArrayList<>();
        Iterator<FacturaProveedor> it = Lista_Factura.iterator();
        while (it.hasNext()) {
            FacturaProveedor current = (FacturaProveedor) it.next();
            if (current.getProveedor().getNombre().contains(Filter)) {
                Get.add(current);
            }
        }
        return Get;
    }

    public void Update (int Index, FacturaProveedor Factura){
        Lista_Factura.set(Index, Factura);
    }
    
    public void Delete (int Index){
        Lista_Factura.remove(Index);
    }
    
    public ArrayList<FacturaProveedor> getLista_Factura() {
        return Lista_Factura;
    }

}
