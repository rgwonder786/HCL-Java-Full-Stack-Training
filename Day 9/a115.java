//Example of Stack Usage:
public class a115 {
    public static void main(String[] args) {
        int x = 10; // Stored in the stack
        int y = 20; // Stored in the stack
        int result = add(x, y); // Method call adds a new stack frame
    }

    public static int add(int a, int b) {
        int sum = a + b; // a, b, and sum are stored in the stack
        return sum; // When the method finishes, the frame is removed
    }
}