//Protected Access Modifier in Java
class Animal {
    protected String name = "Tommy";

    protected void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    void display() {
        // Accessing protected members of parent class
        System.out.println("Name: " + name);
        eat();
    }
}

public class a52 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}
