import java.util.Optional;

public class b56 {
    public static void main(String[] args) {

        // Optional.of() — value must not be null
        Optional<String> obj = Optional.of("Rahul");
        System.out.println(obj);

        // ifPresent() — executes action if value exists
        obj.ifPresent(System.out::println);

        // Optional.ofNullable() — allows null
        Optional<String> obj1 = Optional.ofNullable(null);
        System.out.println(obj1);

        // get() — retrieves the value
        Optional<String> obj2 = Optional.of("Raj");
        System.out.println(obj2.get());

        // Empty Optional
        Optional<String> obj3 = Optional.ofNullable(null);
        System.out.println(obj3.isPresent()); // false

        // isPresent() — returns boolean
        Optional<String> obj4 = Optional.of("Raj");
        System.out.println(obj4.isPresent()); // true

        // orElse() — provides a default value
        Optional<String> obj5 = Optional.ofNullable(null);
        System.out.println(obj5.orElse("Guest"));
    }
}