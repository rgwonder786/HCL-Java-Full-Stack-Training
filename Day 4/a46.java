//Prcedence of Variable 
//Statement : Super Keyword is used to refer the parent class instance variable.

class first {
    int no = 10;
}

class second extends first {
    int no = 20;

    void show(int no) {

        System.out.println("The value of no is : " + no);
        System.out.println("The value of no is : " + this.no);
        System.out.println("The value of no is : " + super.no);
    }
}

public class a46 {

    public static void main(String[] args) {
        second obj = new second();
        obj.show(30);
    }

}
