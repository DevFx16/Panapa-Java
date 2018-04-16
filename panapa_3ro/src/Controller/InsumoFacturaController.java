package Controller;

import Model.FacturaInsumo;
import Model.Insumo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class InsumoFacturaController {

    public static ArrayList<FacturaInsumo> Lista_Factura = new ArrayList<>();
    UsuarioController userco = new UsuarioController();
    private SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");

    public void Create(FacturaInsumo Factura) {
        Lista_Factura.add(Factura);
        userco.salvar_datos();
    }

    public ArrayList<String[]> ReadAll() {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_Factura().size(); i++) {
            Get.add(new String[]{i + "", Format.format(getLista_Factura().get(i).getFecha().getTime()),
                getLista_Factura().get(i).getInsumo_Compra().size() + "", getLista_Factura().get(i).getTotal() + "",
                getLista_Factura().get(i).getPago() + "", (getLista_Factura().get(i).getTotal() - getLista_Factura().get(i).getPago()) + ""});
        }
        return Get;
    }

    public ArrayList<String[]> Read(Calendar Inicio, Calendar Fin) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_Factura().size(); i++) {
            System.out.println(Inicio.getTime());
            System.out.println(Fin.getTime());
            if (getLista_Factura().get(i).getFecha().after(Inicio) && getLista_Factura().get(i).getFecha().before(Fin)) {
                Get.add(new String[]{i + "", Format.format(getLista_Factura().get(i).getFecha().getTime()),
                    getLista_Factura().get(i).getInsumo_Compra().size() + "", getLista_Factura().get(i).getTotal() + "",
                    getLista_Factura().get(i).getPago() + "", (getLista_Factura().get(i).getTotal() - getLista_Factura().get(i).getPago()) + ""});
            }
        }
        return Get;
    }

    public ArrayList<String[]> ReadSelect(int Index) {
        ArrayList<String[]> Get = new ArrayList<>();
        for (int i = 0; i < getLista_Factura().get(Index).getInsumo_Compra().size(); i++) {
            Get.add(new String[]{getLista_Factura().get(Index).getInsumo_Compra().get(i).getNombre(),
                getLista_Factura().get(Index).getInsumo_Compra().get(i).getCantidad() + "",
                (getLista_Factura().get(Index).getInsumo_Compra().get(i).getPrecio() * getLista_Factura().get(Index).getInsumo_Compra().get(i).getCantidad()) + ""});
        }
        return Get;
    }

    public void Update(int Index, FacturaInsumo Factura) {
        Lista_Factura.set(Index, Factura);
        userco.salvar_datos();
    }

    public void Delete(int Index) {
        Lista_Factura.remove(Index);
        userco.salvar_datos();
    }

    public void MayoresVendidos () {

    }

    public void MenoresVendidos() {

    }

    public void MayoresGanancias() {

    }

    public void MenoresGanancias() {

    }

    public ArrayList<FacturaInsumo> getLista_Factura() {
        return Lista_Factura;
    }

    public void setLista_Factura(ArrayList<FacturaInsumo> Lista_Factura) {
        this.Lista_Factura = Lista_Factura;
    }
}
