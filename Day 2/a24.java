//Using continue in a while loop
/*
Important Notes:
The continue statement works with for, while, and do-while loops.
It only skips the current iteration of the loop and does not terminate the loop entirely.
We should use continue carefully, as it can sometimes make the program harder to understand.
*/
public class a24 {

    public static void main(String[] args) {

        int number = 1;

        while (number <= 5) {
            if (number == 3) {
                System.out.println("Skipping number: " + number);
                number++; // Increment the number to avoid an infinite loop
                continue; // Skip the rest of the code in this iteration
            }
            System.out.println("Number: " + number);
            number++;
        }
    }
}
