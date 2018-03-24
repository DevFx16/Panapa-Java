package Controller;

import Model.Insumo;
import java.util.ArrayList;

public class InsumoController {

    ArrayList<Insumo> Lista_Insumos = new ArrayList<>();

    public void Create(Insumo Factura) {
        Lista_Insumos.add(Factura);
    }

    public ArrayList<Insumo> Read(String Filter) {
        ArrayList<Insumo> Get = new ArrayList<>();
        for (Insumo Fact : getLista_Insumos()) {
            if (Fact.getId().contains(Filter)) {
                Get.add(Fact);
            }
        }
        return Get;
    }

    public void Update(int Index, Insumo Factura) {
        Lista_Insumos.set(Index, Factura);
    }

    public void Delete(int Index) {
        Lista_Insumos.remove(Index);
    }    

    public ArrayList<Insumo> getLista_Insumos() {
        return Lista_Insumos;
    }

    public void setLista_Insumos(ArrayList<Insumo> Lista_Insumos) {
        this.Lista_Insumos = Lista_Insumos;
    }
    
}
