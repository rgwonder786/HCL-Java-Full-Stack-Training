//Java var Keyword
public class a10 {
    
    public static void main(String[] args) {
        
        var num = 5;
        var num1 = 30.48;
        var name = "Rajesh";
        var isGone = true;

        System.out.println(num);
        System.out.println(num1);
        System.out.println(name);
        System.out.println(isGone);
    }
}

/*
The var Keyword
The var keyword was introduced in Java 10 (released in 2018).

The var keyword lets the compiler automatically detect the type of a variable based on the value you assign to it.

This helps you write cleaner code and avoid repeating types, especially for long or complex types.

*/