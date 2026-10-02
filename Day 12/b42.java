//averagingInt()
import java.util.*;
import java.util.stream.Collectors;
public class b42 {
    
    public static void main(String[] args) {
            List<Integer> marks =
            Arrays.asList(70, 80, 90, 60);

        double average =
            marks.stream()
                 .collect(Collectors.averagingInt(
                     Integer::intValue
                 ));

        System.out.println("Average = " + average);
    }
}
