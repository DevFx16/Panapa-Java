package Controller;

import Model.Producto;
import java.util.ArrayList;
import java.util.Iterator;

public class ProductoController extends Controller {

    @Override
    public void Create(Object Model) {
        Array.add(Model);
    }

    @Override
    public ArrayList<Object> Read(String Filter) {
        ArrayList<Object> Get = new ArrayList<>();
        Iterator<Object> it = getArray().iterator();
        while (it.hasNext()) {
            Producto current = (Producto) it.next();
            if (current.getNombre().contains(Filter)) {
                Get.add(current);
            }
        }
        return Get;
    }

    @Override
    public void Delete(int Index) {
        Array.remove(Index);
    }

    @Override
    public void Update(int Index, Object Model) {
       Array.set(Index, (Producto) Model);
    }

}
