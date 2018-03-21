package Models;

public class ProductoModel {
    
    private String Id;
    private String Nombre;
    private int Cantidad;
    private double Precio;

    public ProductoModel(String Id, String Nombre, int Cantidad, double Precio) {
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
