package Model;

public class Producto {
    
    private String Id;
    private String Nombre;
    private double Precio;
    private Proveedor Proveedor;

    public Producto(String Id, String Nombre, double Precio, Proveedor Proveedor) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Proveedor = Proveedor;
    }

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public Proveedor getProveedor() {
        return Proveedor;
    }
 
}
