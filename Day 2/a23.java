/*
 "continue" Statements in Java
The continue statement is used to skip the current iteration of a loop and move to the next iteration without completing the remaining code in the loop for that iteration.
It is useful when we want to skip specific conditions and proceed with the rest of the loop.
How it works:
In Loops:
When the continue statement is encountered, the loop immediately jumps to the next iteration.
In a for loop, the increment/decrement step is executed next.
In a while or do-while loop, the condition is checked again.

*/
public class a23 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                System.out.println("The Skipping Element: " + i);
                continue;
            }
            System.out.println("Numbers: " + i);
        }
    }

}
