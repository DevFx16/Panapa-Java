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
        Lista_Factura.get(Lista_Factura.size() - 1).setInsumo_Compra(Factura.getInsumo_Compra());
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

    public ArrayList<String[]> MayoresVendidos(Calendar Dia) {
        ArrayList<String[]> Array = ListaInsumos(Dia);
        ArrayList<String[]> Mayores = new ArrayList<String[]>();
        for (int i = 0; i < 5; i++) {
            int mayor = 0, index = -1;
            String Prod = "";
            for (int b = 0; b < Array.size(); b++) {
                if (Integer.parseInt(Array.get(b)[2]) >= mayor) {
                    mayor = Integer.parseInt(Array.get(b)[2]);
                    Prod = Array.get(b)[1];
                    index = b;
                }
            }
            if (Array.size() > 0) {
                Array.remove(index);
                Mayores.add(new String[]{Prod, mayor + ""});
            }else{
                break;
            }
        }
        for(String[] ar : Mayores){
            System.out.println(ar[0] +"     "+ar[1]);
        }
        return Mayores;
    }

    private ArrayList<String[]> ListaInsumos(Calendar Dia) {
        ArrayList<String[]> Array = new ArrayList<String[]>();
        for (FacturaInsumo Fact : getLista_Factura()) {
            if (Fact.getFecha().get(Calendar.YEAR) == Dia.get(Calendar.YEAR) && Fact.getFecha().get(Calendar.MONTH) == Dia.get(Calendar.MONTH)
                    && Fact.getFecha().get(Calendar.DAY_OF_YEAR) == Dia.get(Calendar.DAY_OF_YEAR) && Fact.getFecha().get(Calendar.ERA) == Dia.get(Calendar.ERA)) {
                for (Insumo Insu : Fact.getInsumo_Compra()) {
                    if (Array.size() > 0) {
                        boolean Cond = true;
                        for (String[] Ar : Array) {
                            if (Insu.getId().equals(Ar[0])) {
                                Cond = false;
                                Ar[2] = (Integer.parseInt(Ar[2]) + Insu.getCantidad()) + "";
                                break;
                            }
                        }
                        if (Cond) {
                            Array.add(new String[]{Insu.getId(), Insu.getNombre(), Insu.getCantidad() + ""});
                        }
                    } else {
                        Array.add(new String[]{Insu.getId(), Insu.getNombre(), Insu.getCantidad() + ""});
                    }
                }
            }
        }
        return Array;
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
