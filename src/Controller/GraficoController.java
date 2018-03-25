package Controller;

import Model.Grafica;
import java.util.ArrayList;
import java.util.Date;

public class GraficoController {

    private ArrayList<Grafica> Lista_Graficas = new ArrayList<Grafica>();

    public void Create(Grafica Graf) {
        Lista_Graficas.add(Graf);
    }

    public ArrayList<Grafica> Read(Date Fecha) {
        ArrayList<Grafica> Get = new ArrayList<>();
        for (Grafica Pro : getLista_Graficas()) {
            if (Pro.getFecha().getDay() == Fecha.getDate()) {
                Get.add(Pro);
            }
        }
        return Get;
    }

    public void Remove(int Index){
        Lista_Graficas.remove(Index);
    }
    
    public ArrayList<Grafica> getLista_Graficas() {
        return Lista_Graficas;
    }
}
