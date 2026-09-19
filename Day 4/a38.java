//Java this Keyword
public class a38 {

    int num = 10;

    void test(int num) {
        System.out.println("The value of Num is: " + this.num);
        System.out.println("The value of Num is: " + num);
    }

    public static void main(String[] args) {

        a38 obj = new a38();
        obj.test(20);
    }
}
