package Controller;

import Model.FacturaInsumo;
import java.util.ArrayList;

public class InsumoFacturaController {

    public static ArrayList<FacturaInsumo> Lista_Factura = new ArrayList<>();
    UsuarioController userco = new UsuarioController();

    public void Create(FacturaInsumo Factura) {
        Lista_Factura.add(Factura);
        userco.salvar_datos();
    }

    public ArrayList<FacturaInsumo> Read(String Filter) {
        ArrayList<FacturaInsumo> Get = new ArrayList<>();
        for (FacturaInsumo Fact : getLista_Factura()) {
            if (Fact.getId().contains(Filter)) {
                Get.add(Fact);
            }
        }
        return Get;
    }

    public void Update(int Index, FacturaInsumo Factura) {
        Lista_Factura.set(Index, Factura);
        userco.salvar_datos();
    }

    public void Delete(int Index) {
        Lista_Factura.remove(Index);
        userco.salvar_datos();
    }

    public ArrayList<FacturaInsumo> getLista_Factura() {
        return Lista_Factura;
    }

    public void setLista_Factura(ArrayList<FacturaInsumo> Lista_Factura) {
        this.Lista_Factura = Lista_Factura;
    }
}
