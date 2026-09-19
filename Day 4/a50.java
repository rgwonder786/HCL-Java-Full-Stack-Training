//Private Access Modifier
class person {
    private String name; // private variable

    public void setName(String name) {
        this.name = name; // accessible within class
    }

    public String getName() {
        return name;

    }

}

public class a50 {
    public static void main(String[] args) {
        person obj = new person();
        obj.setName("Rahul");
        System.out.println(obj.getName());
    }
}
