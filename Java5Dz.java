import java.util.HashMap;
import java.util.Map;

public class Java5Dz {
    public static void main(String[] args) {
        Map <Integer, String> string = new HashMap<>();
        string.put(0, "green");
        string.put(1, "red");
        string.put(2, "black");
        string.put(3, "cyan");
        System.out.println(string); 
        string.forEach((i, f)->string.compute(i,(c,r)->(r=r+"!")));
        System.out.println(string);    
        
    }
    
}
