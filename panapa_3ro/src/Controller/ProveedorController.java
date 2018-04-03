package Controller;

import Model.Proveedor;
import java.util.ArrayList;
import java.util.UUID;

public class ProveedorController {

    private ArrayList<Proveedor> lista_proovedor = new ArrayList();
    
    public ProveedorController(){
        Create(new Proveedor(UUID.randomUUID().toString(), "DELICIAS LAS 51", "PANADERIA", "ALGUNO", "ALGUNO", "", 0));
        Create(new Proveedor(UUID.randomUUID().toString(), "COCA", "PANADERIA", "ALGUNO", "ALGUNO", "", 0));
    }
    
    public void Create(Proveedor Model) {
        lista_proovedor.add(Model);
    }
    
    public ArrayList<Proveedor> Read(String Filter) {
        ArrayList<Proveedor> Get = new ArrayList<>();
        for(Proveedor Pro : getLista_proovedor()){
            if(Pro.getNombre().contains(Filter)){
                Get.add(Pro);
            }
        }
        return Get;
    }
   
    public void Delete(int Index) {
        lista_proovedor.remove(Index);
    }
    
    public void Update(int Index, Proveedor Model) {
       lista_proovedor.set(Index, Model);
    }

    public ArrayList<Proveedor> getLista_proovedor() {
        return lista_proovedor;
    }

    public void setLista_proovedor(ArrayList<Proveedor> lista_proovedor) {
        this.lista_proovedor = lista_proovedor;
    }
}
