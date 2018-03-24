package Controller;

import Model.FacturaProveedor;
import java.util.ArrayList;

public class ProveedorFacturaController {

    ArrayList<FacturaProveedor> Lista_Factura = new ArrayList<>();

    public void Create(FacturaProveedor Factura) {
        Lista_Factura.add(Factura);
    }

    public ArrayList<FacturaProveedor> Read(String Filter) {
        ArrayList<FacturaProveedor> Get = new ArrayList<>();
        for(FacturaProveedor Fact : getLista_Factura()){
            if(Fact.getId().contains(Filter)){
                Get.add(Fact);
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
