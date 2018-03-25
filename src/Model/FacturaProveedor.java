package Model;


import Model.Facturas;
import Model.Proveedor;
import java.util.ArrayList;
import java.util.Date;

public class FacturaProveedor extends Facturas{
    
    private Proveedor Proveedor;
    private ArrayList<Insumo> Insumo_Compra = new ArrayList<>();
    private ArrayList<Integer> Cantidad = new ArrayList<>();
    
    public FacturaProveedor(String Id, Date Fecha, double Total, Proveedor Proveedor, double Pago, 
            ArrayList<Integer> Cantidad, ArrayList<Insumo> Insumo_Compra) {
        super(Id, Fecha, Total, Pago);
        this.Proveedor = Proveedor;
        this.Insumo_Compra = Insumo_Compra;
        this.Cantidad = Cantidad;
    }

    public Proveedor getProveedor() {
        return Proveedor;
    }

    public ArrayList<Insumo> getInsumo_Compra() {
        return Insumo_Compra;
    }

    public ArrayList<Integer> getCantidad() {
        return Cantidad;
    }
}
