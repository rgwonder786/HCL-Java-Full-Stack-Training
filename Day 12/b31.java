//Terminal Operation: forEach() _ Using Reference Method

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class b31
{
    public static void main(String[] args) {
        
        List<String> Names = new ArrayList<>(Arrays.asList("Rahul","Raj","Rahim"));

        Names.stream()
        .forEach(name->System.out.println(name));
    }
}