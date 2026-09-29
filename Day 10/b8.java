//2. Lambda with One Parameter

interface Student {
    void welcome(String name);
}

public class b8 {
    public static void main(String[] args) {

        Student s = (name) -> System.out.println("Welcome " + name);
        s.welcome("Rahul");
    }
}
