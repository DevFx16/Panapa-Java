/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import View.View1;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.swing.JOptionPane;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class UsuarioController {

    public void salvar_datos() {
        String nameFile = View1.FileName;
        System.out.println(nameFile);
        String path = "..\\PanaderiasData\\" + nameFile + ".dat";
        
        try {
            Usuario u1 = new Usuario(
                    ProductoController.lista_producto,
                    InsumoController.Lista_Insumos,
                    ProveedorController.lista_proovedor,
                    ProductoFacturaController.Lista_Factura,
                    InsumoFacturaController.Lista_Factura,
                    GraficoController.Lista_Graficas);
            FileOutputStream archivo = new FileOutputStream(path);
            ObjectOutputStream obj_archivo = new ObjectOutputStream(archivo);
            obj_archivo.writeObject(u1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido un error con el archivo");
            System.out.println(e);
        }
    }

}
