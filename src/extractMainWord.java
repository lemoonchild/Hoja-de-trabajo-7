import BinaryTree.IGetKey;

public class extractMainWord<K, V> implements IGetKey<K,V>{

    @Override
    public String getKeyFromValue(V value) {
        
        return (String) ((Association)value).getKey();

    }
    
    
}
