package Model;

import java.io.Serializable;

public class Insumo extends Producto implements Serializable{

    private String Unidad;
    public Insumo(String Id, String Nombre, double Precio, Proveedor Proveedor, int Cantidad, String Unidad) {
        super(Id, Nombre, Precio, Proveedor, Cantidad);
        this.Unidad = Unidad;
    }

    public String getUnidad() {
        return Unidad;
    }
   
}
