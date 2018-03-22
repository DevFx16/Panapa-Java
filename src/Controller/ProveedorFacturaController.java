package Controller;

import Model.FacturaProveedor;
import java.util.ArrayList;
import java.util.Iterator;

public class ProveedorFacturaController extends Controller {

    @Override
    public void Create(Object Model) {
        Array.add((FacturaProveedor) Model);
    }

    @Override
    public ArrayList<Object> Read(String Filter) {
        ArrayList<Object> Get = new ArrayList<>();
        Iterator<Object> it = getArray().iterator();
        while (it.hasNext()) {
            FacturaProveedor current = (FacturaProveedor) it.next();
            if (current.getProveedor().getNombre().contains(Filter)) {
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
        Array.set(Index, (FacturaProveedor) Model);
    }

}
