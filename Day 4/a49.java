//Public Access Modifier
/*
The public access modifier is specified using the keyword public. Public members are accessible from everywhere in the program.
*/
class sumAdd {
    public static int add(int a, int b) {
        return a + b;
    }
}

public class a49 {
    public static void main(String[] args) {

        System.out.println(sumAdd.add(40, 50));
    }
}
