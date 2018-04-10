package Model;

import java.io.Serializable;

public class Producto implements Serializable{
    
    private String Id;
    private String Nombre;
    private double Precio;
    private Proveedor Proveedor;
    private int Cantidad;

    public Producto(String Id, String Nombre, double Precio, Proveedor Proveedor, int Cantidad) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Proveedor = Proveedor;
        this.Cantidad = Cantidad;
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

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
