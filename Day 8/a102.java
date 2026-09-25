//4. Generic Class : A class can be made generic by declaring a type parameter.
class Box<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class a102 {
    public static void main(String[] args) {

        Box<String> box1 = new Box<>();
        box1.setValue("Java");

        System.out.println(box1.getValue());

        Box<Integer> box2 = new Box<>();
        box2.setValue(100);

        System.out.println(box2.getValue());
    }
}
