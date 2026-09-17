//  "for" Loop in Java
// The for loop is used to repeat a block of code a specific number of times.
// The for loop is useful when the number of iterations is known beforehand (i.e. we know exactly how many times we need to repeat a task), like when working with arrays or running a piece of code a specific number of times.
/*
Below is syntax explanation:
Initialization: Variable is initialized before the loop starts. This part runs only once at the beginning.
Condition: Checks the condition before each iteration. If the condition is true, the loop continues to execute the for block statements.
Increment/Decrement: Updates the loop variable, helping the loop move toward finishing.
Statements: Statements which are executed when the for loop condition is true.
*/
public class a17 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
    }
}
