
package panapa;

import Controllers.ProductoController;
import Models.ProductoModel;

public class Panapa {

    public static void main(String[] args) {
       ProductoController s = new ProductoController();
        s.Create(new ProductoModel("","",1,1));
        ProductoModel s1 = (ProductoModel) s.getArray().get(0);
        System.out.println(s1.getCantidad());
    }
    
}
