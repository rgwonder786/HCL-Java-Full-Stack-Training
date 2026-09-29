//Lambda with string
interface nameHCL {
    public void name(String name);
}

public class b16 {

    public static void main(String[] args) {

        nameHCL obj = (name) -> System.out.println("Welcome " + name);
        obj.name("Rahul");
    }
}
