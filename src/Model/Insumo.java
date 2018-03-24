package Model;

public class Insumo extends Producto{
    
    private Proveedor Proveedor;
    
    public Insumo(String Id, String Nombre, double Precio, Proveedor Proveedor) {
        super(Id, Nombre, Precio);
        this.Proveedor = Proveedor;
    }

    public Proveedor getProveedor() {
        return Proveedor;
    }
   
}
