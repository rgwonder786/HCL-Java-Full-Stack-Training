//Create No's through Thread with waiting time 10 sec
class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class b105 {
    public static void main(String[] args) {
        MyThread m = new MyThread();
        m.start();
    }
}
