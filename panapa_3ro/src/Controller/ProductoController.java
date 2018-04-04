package Controller;

import Model.Producto;
import java.util.ArrayList;

public class ProductoController {

    private ArrayList<Producto> lista_producto = new ArrayList();

    public void Create(Producto Model) {
        lista_producto.add(Model);
    }

    public ArrayList<String[]> Read(String Filter) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_producto().size(); i++) {
            if (getLista_producto().get(i).getNombre().contains(Filter)) {
                Get.add(new String[]{i + "", getLista_producto().get(i).getNombre(),
                    getLista_producto().get(i).getPrecio() + "", getLista_producto().get(i).getProveedor().getNombre()});
            }
        }
        return Get;
    }

    public ArrayList<String[]> ReadAll() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_producto().size(); i++) {
            Get.add(new String[]{i + "", getLista_producto().get(i).getNombre(), getLista_producto().get(i).getPrecio() + "", getLista_producto().get(i).getProveedor().getNombre()});

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
