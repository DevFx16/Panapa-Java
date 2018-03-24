package Controller;

import Model.Producto;
import java.util.ArrayList;

public class ProductoController {

    ArrayList<Producto> lista_producto = new ArrayList();

    public void Create(Producto Model) {
        lista_producto.add(Model);
    }

    public ArrayList<Producto> Read(String Filter) {
        ArrayList<Producto> Get = new ArrayList<>();
        for (Producto Pro : getLista_producto()) {
            if (Pro.getNombre().contains(Filter)) {
                Get.add(Pro);
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
