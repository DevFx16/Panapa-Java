/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Roberto Batty
 */
public class Usuario implements Serializable{

    private ArrayList<Producto> lista_Producto;
    private ArrayList<Insumo> lista_Insumos;
    private ArrayList<Proveedor> lista_Proovedor;
    private ArrayList<FacturaProducto> lista_Factura_producto;
    private ArrayList<FacturaInsumo> lista_Factura_insumo;
    private ArrayList<Grafica> lista_Graficas;

    public Usuario(
            ArrayList<Producto> lista_Producto,
            ArrayList<Insumo> lista_Insumos,
            ArrayList<Proveedor> lista_Proovedor,
            ArrayList<FacturaProducto> lista_Factura_producto,
            ArrayList<FacturaInsumo> lista_Factura_proveedor,
            ArrayList<Grafica> lista_Graficas
    ) {
        this.lista_Producto = lista_Producto;
        this.lista_Insumos = lista_Insumos;
        this.lista_Proovedor = lista_Proovedor;
        this.lista_Factura_producto = lista_Factura_producto;
        this.lista_Factura_insumo = lista_Factura_proveedor;
        this.lista_Graficas = lista_Graficas;
    }
    
    public ArrayList<Producto> getLista_Producto() {
        return lista_Producto;
    }

    public void setLista_Producto(ArrayList<Producto> lista_Producto) {
        this.lista_Producto = lista_Producto;
    }

    public ArrayList<Insumo> getLista_Insumos() {
        return lista_Insumos;
    }

    public void setLista_Insumos(ArrayList<Insumo> lista_Insumos) {
        this.lista_Insumos = lista_Insumos;
    }

    public ArrayList<Proveedor> getLista_Proovedor() {
        return lista_Proovedor;
    }

    public void setLista_Proovedor(ArrayList<Proveedor> lista_Proovedor) {
        this.lista_Proovedor = lista_Proovedor;
    }

    public ArrayList<FacturaProducto> getLista_Factura_producto() {
        return lista_Factura_producto;
    }

    public void setLista_Factura_producto(ArrayList<FacturaProducto> lista_Factura_producto) {
        this.lista_Factura_producto = lista_Factura_producto;
    }

    public ArrayList<FacturaInsumo> getLista_Factura_insumo() {
        return lista_Factura_insumo;
    }

    public void setLista_Factura_insumo(ArrayList<FacturaInsumo> lista_Factura_proveedor) {
        this.lista_Factura_insumo = lista_Factura_proveedor;
    }

    public ArrayList<Grafica> getLista_Graficas() {
        return lista_Graficas;
    }

    public void setLista_Graficas(ArrayList<Grafica> lista_Graficas) {
        this.lista_Graficas = lista_Graficas;
    }

}
