package Controller;

import Model.Proveedor;
import java.util.ArrayList;
import java.util.Iterator;

public class ProveedorController {

    ArrayList<Proveedor> lista_proovedor = new ArrayList();
    
    public void Create(Proveedor Model) {
        lista_proovedor.add(Model);
    }
    
    public ArrayList<Proveedor> Read(String Filter) {
        ArrayList<Proveedor> Get = new ArrayList<>();
        Iterator<Proveedor> it = lista_proovedor.iterator();
        while (it.hasNext()) {
            Proveedor current = (Proveedor) it.next();
            if (current.getNombre().contains(Filter)) {
                Get.add(current);
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
