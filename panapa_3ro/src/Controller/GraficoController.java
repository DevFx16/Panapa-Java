package Controller;

import Model.Grafica;
import java.util.ArrayList;
import java.util.Calendar;

public class GraficoController {

    public static ArrayList<Grafica> Lista_Graficas = new ArrayList<Grafica>();
    UsuarioController userco = new UsuarioController();

    public void Create(Grafica Graf) {
        if (!GrafiaExiste(Graf) || Lista_Graficas.size() == 0) {
            Lista_Graficas.add(Graf);
        } else if (Index(Graf) >= 0) {
            Update(Index(Graf), Graf);
        }
        userco.salvar_datos();
    }

    public Grafica Read(Calendar Fecha, int Tipo) {
        for (Grafica graf : getLista_Graficas()) {
            if (graf.getTipo() == Tipo && Fecha.get(Calendar.YEAR) == graf.getFecha().get(Calendar.YEAR) && Fecha.get(Calendar.MONTH)
                    == graf.getFecha().get(Calendar.MONTH) && Fecha.get(Calendar.DAY_OF_YEAR) == graf.getFecha().get(Calendar.DAY_OF_YEAR)
                    && Fecha.get(Calendar.ERA) == graf.getFecha().get(Calendar.ERA)) {
                return graf;
            }
        }
        return null;
    }

    private boolean GrafiaExiste(Grafica grafica) {
        for (Grafica graf : getLista_Graficas()) {
            if (graf.getTipo() == grafica.getTipo() && grafica.getFecha().get(Calendar.YEAR) == graf.getFecha().get(Calendar.YEAR) && grafica.getFecha().get(Calendar.MONTH)
                    == graf.getFecha().get(Calendar.MONTH) && grafica.getFecha().get(Calendar.DAY_OF_YEAR) == graf.getFecha().get(Calendar.DAY_OF_YEAR)
                    && grafica.getFecha().get(Calendar.ERA) == graf.getFecha().get(Calendar.ERA)) {
                return true;
            }
        }
        return false;
    }

    private int Index(Grafica grafica) {
        for (int i = 0; i < getLista_Graficas().size(); i++) {
            if (getLista_Graficas().get(i).getTipo() == grafica.getTipo() && grafica.getFecha().get(Calendar.YEAR) == getLista_Graficas().get(i).getFecha().get(Calendar.YEAR)
                    && grafica.getFecha().get(Calendar.MONTH) == getLista_Graficas().get(i).getFecha().get(Calendar.MONTH)
                    && grafica.getFecha().get(Calendar.DAY_OF_YEAR) == getLista_Graficas().get(i).getFecha().get(Calendar.DAY_OF_YEAR)
                    && grafica.getFecha().get(Calendar.ERA) == getLista_Graficas().get(i).getFecha().get(Calendar.ERA)) {
                return i;
            }
        }
        return -1;
    }

    public void Remove(int Index) {
        Lista_Graficas.remove(Index);
        userco.salvar_datos();
    }

    public void Update(int Index, Grafica Graf) {
        Lista_Graficas.set(Index, Graf);
        userco.salvar_datos();
    }

    public ArrayList<Grafica> getLista_Graficas() {
        return Lista_Graficas;
    }

    public static void setLista_Graficas(ArrayList<Grafica> Lista_Graficas) {
        GraficoController.Lista_Graficas = Lista_Graficas;
    }
}
