package Controller;

import Model.Insumo;
import java.util.ArrayList;

public class InsumoController {

    public static ArrayList<Insumo> Lista_Insumos = new ArrayList<Insumo>();
    UsuarioController userco = new UsuarioController();

    public void Create(Insumo Factura) {
        Lista_Insumos.add(Factura);
        userco.salvar_datos();
    }

    public ArrayList<String[]> Read(String Filter) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_Insumos().size(); i++) {
            if (getLista_Insumos().get(i).getNombre().contains(Filter)) {
                Get.add(new String[]{i + "", getLista_Insumos().get(i).getNombre(),
                    getLista_Insumos().get(i).getPrecio() + "", getLista_Insumos().get(i).getProveedor().getNombre(),
                    getLista_Insumos().get(i).getUnidad()});
            }
        }
        return Get;
    }

    public ArrayList<String[]> ReadAll() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_Insumos().size(); i++) {
            Get.add(new String[]{i + "", getLista_Insumos().get(i).getNombre(),
                String.valueOf(getLista_Insumos().get(i).getPrecio()), getLista_Insumos().get(i).getProveedor().getNombre(),
                getLista_Insumos().get(i).getUnidad()});

        }
        return Get;
    }
    
    public ArrayList<String[]> ReadVenta(String readventa) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_Insumos().size(); i++) {
            Get.add(new String[]{i + "", getLista_Insumos().get(i).getNombre(),
                String.valueOf(getLista_Insumos().get(i).getPrecio())});

        }
        return Get;
    }
    
        public ArrayList<String[]> ReadVenta() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_Insumos().size(); i++) {
            Get.add(new String[]{i + "", getLista_Insumos().get(i).getNombre(),
                String.valueOf(getLista_Insumos().get(i).getPrecio())});

        }
        return Get;
    }

    public void Update(int Index, Insumo Factura) {
        Lista_Insumos.set(Index, Factura);
        userco.salvar_datos();
    }    

    public void Delete(int Index) {
        Lista_Insumos.remove(Index);
        userco.salvar_datos();
    }

    public ArrayList<Insumo> getLista_Insumos() {
        return Lista_Insumos;
    }

    public void setLista_Insumos(ArrayList<Insumo> Lista_Insumos) {
        this.Lista_Insumos = Lista_Insumos;
    }
    
    public Insumo Get_Insumo(int Index){
        Insumo h = this.Lista_Insumos.get(Index);
        return h;
    }

}
