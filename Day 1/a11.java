//Java Type Casting
/*
Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte
*/
//Widening Casting (automatic)
public class a11 {
    
    public static void main(String[] args) {
        
        int num = 25;
        double d = num;
        
        System.out.println(num);
        System.out.println(d);
    }
}
