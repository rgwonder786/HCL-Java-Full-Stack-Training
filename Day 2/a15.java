//"if-else if" Ladder Statement in Java
// The if-else if ladder in Java evaluates multiple boolean conditions in sequence.
// If any of the condition is true, the block of code associated with that condition is executed; if none of the conditions are true, the optional else block runs.
public class a15 {

    public static void main(String[] args) {

        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

    }
}
