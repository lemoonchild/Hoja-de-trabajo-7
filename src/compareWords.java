import java.util.Comparator;

public class compareWords implements Comparator<String>{

    @Override
    public int compare(String o1, String object) {
        
        if(o1.equalsIgnoreCase(object)){
            return 0;
        }else{
            return 1; 
        }
    }
    
}
