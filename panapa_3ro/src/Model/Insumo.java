package Model;

public class Insumo extends Producto{
    
    String Unidad;
    public Insumo(String Id, String Nombre, double Precio, Proveedor Proveedor, int Cantidad, String Unidad) {
        super(Id, Nombre, Precio, Proveedor, Cantidad);
        this.Unidad = Unidad;
    }

    public String getUnidad() {
        return Unidad;
    }
    
}
