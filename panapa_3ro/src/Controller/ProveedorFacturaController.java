package Controller;

import Model.FacturaProveedor;
import java.util.ArrayList;

public class ProveedorFacturaController {

    public static ArrayList<FacturaProveedor> Lista_Factura = new ArrayList<>();
    UsuarioController userco = new UsuarioController();

    public void Create(FacturaProveedor Factura) {
        Lista_Factura.add(Factura);
        userco.salvar_datos();
    }

    public ArrayList<FacturaProveedor> Read(String Filter) {
        ArrayList<FacturaProveedor> Get = new ArrayList<>();
        for (FacturaProveedor Fact : getLista_Factura()) {
            if (Fact.getId().contains(Filter)) {
                Get.add(Fact);
            }
        }
        return Get;
    }

    public void Update(int Index, FacturaProveedor Factura) {
        Lista_Factura.set(Index, Factura);
        userco.salvar_datos();
    }

    public void Delete(int Index) {
        Lista_Factura.remove(Index);
        userco.salvar_datos();
    }

    public ArrayList<FacturaProveedor> getLista_Factura() {
        return Lista_Factura;
    }

    public void setLista_Factura(ArrayList<FacturaProveedor> Lista_Factura) {
        this.Lista_Factura = Lista_Factura;
    }
}
