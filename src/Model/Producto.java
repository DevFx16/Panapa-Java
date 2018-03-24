package Model;

public class Producto {
    
    private String Id;
    private String Nombre;
    private double Precio;

    public Producto(String Id, String Nombre, double Precio) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
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
    
}
