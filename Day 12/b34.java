//Terminal Operation: max() 
//import java.util.*;
import java.util.Arrays;
import java.util.List;
public class b34 {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(25,26,28,49,100);
        
        int max = list.stream()
        .filter(n->n>26)
        .max(Integer::compareTo)
        .orElse(0);

        System.out.println(max);

    }
}
