
// var Is Not Dynamic Typing
import java.util.*;

public class b84 {
    public static void main(String[] args) {

        var name = "Rahul";
        var age = 22;
        var Salary = 88000.888;
        var names = new ArrayList<String>(List.of("Rahul", "Raj", "Rohit"));
        // var age = "Shyam"; -> Creates Compilation Error
        // public var num = 23; -> Can not use on Public Variable.
        // var con = (num)->{}; -> Lambda needs explicit target type
        // var myarray = {1,2,2,3,4,5}; -> Array needs explicit target type
        // var num1 = null; -> Should be initialized

        System.out.println(name);
        System.out.println(age);
        System.out.println(Salary);
        System.out.println(names);

    }
}
