//Generic Class // We use < > to specify Parameter type
/*
Note: In Parameter type, we can not use primitives like "int", "char" or "double". Use wrapper classes like Integer, Character, etc.
*/
class test<T> {
    T obj; // T used as a variable type

    test(T obj) { // T used as constructor parameter
        this.obj = obj;
    }

    public T getObject() { // T used as return type
        return this.obj;
    }
}

public class a97 {
    public static void main(String[] args) {
        // Integer Object
        test<Integer> iobj = new test<Integer>(15);
        System.out.println(iobj.getObject());

        // String Object
        test<String> sobj = new test<>("Rahul");
        System.out.println(sobj.getObject());
    }

}
