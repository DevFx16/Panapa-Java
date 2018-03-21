package Controllers;

import Models.FacturaProveedorModel;
import java.util.ArrayList;
import java.util.Iterator;

public class ProveedorFacturaController extends Controller {

    @Override
    public void Create(Object Model) {
        Array.add((FacturaProveedorModel) Model);
    }

    @Override
    public ArrayList<Object> Read(String Filter) {
        ArrayList<Object> Get = new ArrayList<>();
        Iterator<Object> it = getArray().iterator();
        while (it.hasNext()) {
            FacturaProveedorModel current = (FacturaProveedorModel) it.next();
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
        Array.set(Index, (FacturaProveedorModel) Model);
    }

}
