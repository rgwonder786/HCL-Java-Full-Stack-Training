
//Preacution for NULL using if else
public class b57 {

    public static void main(String[] args) {

        User user = getUser();

        // Precautions for null
        if (user != null) {
            Address address = user.address;

            if (address != null) {
                String city = address.city;

                if (city != null) {
                    System.out.println(city);
                } else {
                    System.out.println("City is null");
                }
            } else {
                System.out.println("Address is null");
            }
        } else {
            System.out.println("User is null");
        }
    }

    private static User getUser() {

        Address a = new Address();
        a.city = "Jaipur";

        User u = new User();
        u.address = a; // Assign Address to User

        return u;
    }

    static class User {
        public Address address;
    }

    static class Address {
        public String city;
    }
}