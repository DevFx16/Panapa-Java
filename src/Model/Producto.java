package Model;

public class Producto {
    
    private String Id;
    private String Nombre;
    private int Cantidad;
    private double Precio;

    public Producto(String Id, String Nombre, int Cantidad, double Precio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public double getPrecio() {
        return Precio;
    }
    
}
