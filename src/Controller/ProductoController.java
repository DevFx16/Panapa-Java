package Controller;

import Model.Producto;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductoController{

    ArrayList<Producto> lista_producto = new ArrayList();
    
    public void Create(Producto Model) {
        lista_producto.add(Model);
    }
    
    public ArrayList<Producto> Read(String Filter) {
        ArrayList<Producto> Get = new ArrayList<>();
        Iterator<Producto> it = getLista_producto().iterator();
        while (it.hasNext()) {
            Producto current = (Producto) it.next();
            if (current.getNombre().contains(Filter)) {
                Get.add(current);
            }
        }
        return Get;
    }
   
    public void Delete(int Index) {
        lista_producto.remove(Index);
    }
    
    public void Update(int Index, Producto Model) {
       lista_producto.set(Index, Model);
    }

    public ArrayList<Producto> getLista_producto() {
        return lista_producto;
    }

    public void setLista_producto(ArrayList<Producto> lista_producto) {
        this.lista_producto = lista_producto;
    }    
    
}
