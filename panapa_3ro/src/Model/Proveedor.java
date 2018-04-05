package Model;

import java.io.Serializable;

public class Proveedor implements Serializable{

    private String Id;
    private String Nombre;
    private String Servicio;
    private String Telefono;
    private String Direccion;
    private String NIT;
    private double Precio_Paquete;

    public Proveedor(String Id, String Nombre, String Servicio, String Telefono, String Direccion, String NIT, double Precio_Paquete) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Servicio = Servicio;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.NIT = NIT;
        this.Precio_Paquete = Precio_Paquete;
    }

    public String getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getServicio() {
        return Servicio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public String getNIT() {
        return NIT;
    }

    public double getPrecio_Paquete() {
        return Precio_Paquete;
    }
}
