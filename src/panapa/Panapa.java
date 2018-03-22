
package panapa;

import Controller.ProductoController;
import Model.Producto;

public class Panapa {

    public static void main(String[] args) {
       ProductoController s = new ProductoController();
        s.Create(new Producto("","",1,1));
        Producto s1 = (Producto) s.getArray().get(0);
        System.out.println(s1.getCantidad());
    }
    
}
