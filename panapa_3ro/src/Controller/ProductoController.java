package Controller;

import Model.Producto;
import java.io.Serializable;
import java.util.ArrayList;

public class ProductoController {

    public static ArrayList<Producto> lista_producto = new ArrayList();
    UsuarioController userco = new UsuarioController();

    public void Create(Producto Model) {
        lista_producto.add(Model);
        userco.salvar_datos();
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
            Get.add(new String[]{i + "", getLista_producto().get(i).getNombre(), getLista_producto().get(i).getPrecio() + "",
                getLista_producto().get(i).getProveedor().getNombre()});
        }
        return Get;
    }

    public ArrayList<String[]> ReadVenta(String Filter) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_producto().size(); i++) {
            if (getLista_producto().get(i).getNombre().contains(Filter)) {
                Get.add(new String[]{i + "", getLista_producto().get(i).getNombre(), getLista_producto().get(i).getCantidad() + "",
                    getLista_producto().get(i).getPrecio() + ""});
            }
        }
        return Get;
    }

    public ArrayList<String[]> ReadVenta() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_producto().size(); i++) {
            Get.add(new String[]{i + "", getLista_producto().get(i).getNombre(), getLista_producto().get(i).getCantidad() + "",
                getLista_producto().get(i).getPrecio() + ""});

        }
        return Get;
    }

    public void Delete(int Index) {
        lista_producto.remove(Index);
        userco.salvar_datos();
    }

    public void Update(int Index, Producto Model) {
        lista_producto.set(Index, Model);
        userco.salvar_datos();
    }

    public void UpateCantidad(int[] Index, int Cantidad) {
        for (int i = 0; i < Index.length; i++) {
            getLista_producto().get(Index[i]).setCantidad(Cantidad);
        }
        userco.salvar_datos();
    }

    public void CantidadVenta(int Index, int Cantidad) {
        getLista_producto().get(Index).setCantidad((getLista_producto().get(Index).getCantidad() - Cantidad));
    }

    public void CantidadVentaCancelar(int Index, int Cantidad) {
        getLista_producto().get(Index).setCantidad((getLista_producto().get(Index).getCantidad() + Cantidad));
    }

    public ArrayList<Producto> getLista_producto() {
        return lista_producto;
    }

    public Producto GetProducto(int Index) {
        return lista_producto.get(Index);
    }

    public void setLista_producto(ArrayList<Producto> lista_producto) {
        this.lista_producto = lista_producto;
    }

}
