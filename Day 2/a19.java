/*
"do-while" Loop in Java
The do-while loop is used to repeat a block of code at least once and then repeatedly as long as the condition is true.
The do-while loop is useful when we want the code to run at least once, even if the condition is false initially.
*/
//Task : The user will provide an input, and we need to check whether it is a positive or negative number.

import java.util.Scanner;

public class a19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.println("Enter a positive no.");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("You Entered a valid +ve No: " + n);
        sc.close();
    }

}
