import java.util.Comparator;

public class compareWords implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        
        if(o1.equalsIgnoreCase(o2)){
            return 0;
        }else{
            return 1; 
        }
    }
    
}
