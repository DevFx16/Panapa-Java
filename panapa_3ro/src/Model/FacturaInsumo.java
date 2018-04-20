package Model;

import Model.Facturas;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

public class FacturaInsumo extends Facturas implements Serializable {

    private ArrayList<Insumo> Insumo_Compra = new ArrayList<>();

    public FacturaInsumo(String Id, Calendar Fecha, double Total, double Pago,
            ArrayList<Insumo> Insumo_Compra) {
        super(Id, Fecha, Total, Pago);
        this.Insumo_Compra = Insumo_Compra;
    }

    public ArrayList<Insumo> getInsumo_Compra() {
        return Insumo_Compra;
    }

    public void setInsumo_Compra(ArrayList<Insumo> Insumo_Compra) {
        this.Insumo_Compra = Insumo_Compra;
    }

}
