package Controller;

import Model.FacturaProducto;
import java.util.ArrayList;

public class ProductoFacturaController {
    
    ArrayList<FacturaProducto> Lista_Factura = new ArrayList<>();

    public void Create(FacturaProducto Factura) {
        Lista_Factura.add(Factura);
    }

    public ArrayList<FacturaProducto> Read(String Filter) {
        ArrayList<FacturaProducto> Get = new ArrayList<>();
        for(FacturaProducto Fact : getLista_Factura()){
            if(Fact.getId().contains(Filter)){
                Get.add(Fact);
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

    public void setLista_Factura(ArrayList<FacturaProducto> Lista_Factura) {
        this.Lista_Factura = Lista_Factura;
    }
}
