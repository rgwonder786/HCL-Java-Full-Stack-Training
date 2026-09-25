//Generic Class with Multiple Parameters
class genR1<P, V> {
    P id;
    V name;

    genR1(P id, V name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
    }
}

public class a103 {

    public static void main(String[] args) {
        genR1<Integer, String> obj = new genR1<>(101, "Rahul");
        obj.display();
    }
}
