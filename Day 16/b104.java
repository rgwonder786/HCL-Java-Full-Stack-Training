//Normal Thread Example 1
class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello from Child Thread");
        }
    }
}

public class b104 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
