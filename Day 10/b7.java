
//Lambda 1 : Hello Express 
// import java.util.*;

interface Greeting {
    public void hello();
}

//
public class b7 {

    public static void main(String[] args) {

        Greeting obj = () -> System.out.println("Hello");
        obj.hello();
    }
}
