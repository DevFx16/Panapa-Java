
package Controller;

import java.util.ArrayList;

abstract public class Controller {
    
    protected ArrayList<Object> Array = new ArrayList<>();
    
    abstract public void Create(Object Model);
    abstract public ArrayList<Object> Read(String Filter);
    abstract public void Delete(int Index);
    abstract public void Update(int Index, Object Model);

    public ArrayList<Object> getArray() {
        return Array;
    }

    public void setArray(ArrayList<Object> Array) {
        this.Array = Array;
    }
    
    
    
}
