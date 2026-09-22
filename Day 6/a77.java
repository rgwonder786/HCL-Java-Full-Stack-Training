//Throw Example -2 
public class a77 {

    public static void main(String[] args) {
        try {
            int age = 15;

            if (age < 18) {
                throw new Exception("Not eligible for voting");
            }

            System.out.println("Eligible");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
