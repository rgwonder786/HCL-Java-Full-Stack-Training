//Showing Class and Object
public class a26 {

    String voice; // instance variable

    void sound() // method
    {
        System.out.println("Dog Barks");
    }

    public static void main(String[] args) {

        a26 obj = new a26(); // creating object (obj)
        obj.sound(); // accessing sound() method from (obj) object
        obj.voice = "Meaw"; // setting value in instance variable using . operator
        System.out.println("Cat Voice is: " + obj.voice); // accessing instance variable
    }
}