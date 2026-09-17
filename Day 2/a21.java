/*
 "break" Statement in Java
The break statement is used to exit a loop or a switch statement before it has completed its normal execution.
Loops: The break statement can be used to terminate loops (for, while, do-while) prematurely when a specific condition is met.
Switch Statements: It is commonly used in switch statements to exit a particular case and prevent the execution of subsequent cases.
How it works:
The break statement stops the loop or case execution and moves the control to the first statement outside the loop or switch block.
*/
//Using break in a loop
public class a21 {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Loop will stop at : " + i);
                break;
            }
            System.out.println("No: " + i);
        }
    }
}
