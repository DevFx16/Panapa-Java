package Controller;

import Model.Grafica;
import java.util.ArrayList;
import java.util.Date;

public class GraficoController {

    public static ArrayList<Grafica> Lista_Graficas = new ArrayList<Grafica>();
    UsuarioController userco = new UsuarioController();

    public void Create(Grafica Graf) {
        Lista_Graficas.add(Graf);
        userco.salvar_datos();
    }

    public ArrayList<Grafica> Read(Date Fecha) {
        ArrayList<Grafica> Get = new ArrayList<>();
        return Get;
    }

    public void Remove(int Index){
        Lista_Graficas.remove(Index);
        userco.salvar_datos();
    }
    
    public ArrayList<Grafica> getLista_Graficas() {
        return Lista_Graficas;
    }
}
