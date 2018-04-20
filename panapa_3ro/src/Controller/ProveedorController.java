package Controller;

import Model.Proveedor;
import java.io.Serializable;
import java.util.ArrayList;

public class ProveedorController implements Serializable{

    public static ArrayList<Proveedor> lista_proovedor = new ArrayList();
    UsuarioController userco = new UsuarioController();
    
    public ProveedorController() {
    }

    public void Create(Proveedor Model) {
        lista_proovedor.add(Model);
        userco.salvar_datos();
    }

    public ArrayList<String[]> Read(String Filter) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_proovedor().size(); i++) {
            if (getLista_proovedor().get(i).getNombre().contains(Filter)) {
                Get.add(new String[]{i + "", getLista_proovedor().get(i).getNombre(),
                    getLista_proovedor().get(i).getServicio(), getLista_proovedor().get(i).getTelefono(),
                    getLista_proovedor().get(i).getDireccion(), getLista_proovedor().get(i).getNIT()});
            }
        }
        return Get;
    }

    public ArrayList<String[]> ReadAll() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_proovedor().size(); i++) {
            Get.add(new String[]{i + "", getLista_proovedor().get(i).getNombre(),
                getLista_proovedor().get(i).getServicio(), getLista_proovedor().get(i).getTelefono(),
                getLista_proovedor().get(i).getDireccion(), getLista_proovedor().get(i).getNIT()});
        }
        return Get;
    }

    public void Delete(int Index) {
        lista_proovedor.remove(Index);
        userco.salvar_datos();
    }

    public void Update(int Index, Proveedor Model) {
        lista_proovedor.set(Index, Model);
        userco.salvar_datos();
    }

    public ArrayList<Proveedor> getLista_proovedor() {
        return lista_proovedor;
    }

    public void setLista_proovedor(ArrayList<Proveedor> lista_proovedor) {
        this.lista_proovedor = lista_proovedor;
    }
}
