//Terminal Operation: min() 

import java.util.Arrays;
import java.util.List;
//import java.util.*;

public class b33 {
    
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(30,40,50,55,60);

        int min = list.stream()
        .filter(n->n>30)
        .min(Integer::compareTo)
        .orElse(0);

        System.out.println(min);

    }
}
