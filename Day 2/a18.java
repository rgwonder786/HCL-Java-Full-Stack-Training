/*
"while" Loop in Java
The while loop is used to repeat a block of code as long as a specific condition is true.
The while loop is useful when we don’t know how many times we need to repeat the task, and the loop will continue as long as the condition holds true.

*/
// Task : Print all the even numbers between 1 and 17
public class a18 {
    public static void main(String[] args) {
        int no = 2;
        while (no <= 17) {
            System.out.println("The Even No's are: " + no);
            no = no + 2;
        }
    }

}
