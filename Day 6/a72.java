//Print Exceptions
public class a72 {
    public static void main(String[] args) {
        try {
            int a = 100, b = 0, c;
            c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            //System.out.println(e);
            e.printStackTrace(); // Print Exception E + D + S T
            // System.out.println(e.toString()); // Print E + D -> But No S T
            // System.out.println(e.getMessage());// Only D
        }

    }
}

// E - Exception
// D - Description
// S T - Stack Trace
