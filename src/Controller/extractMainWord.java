package Controller;
import Model.Association;
import Model.IGetKey;

public class extractMainWord<K, V> implements IGetKey<K,V>{
    /*
    * Metodo para obtener la llave del valor ingresado 
    */
    @Override
    public String getKeyFromValue(V value) {
        
        return (String) ((Association)value).getKey();

    }
    
    
}
