//Context switching
class MyTask implements Runnable {

    private String name;

    MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(name + " : " + i);
        }
    }
}

public class b71 {

    public static void main(String[] args) {

        Thread t1 = new Thread(new MyTask("Thread A"));
        Thread t2 = new Thread(new MyTask("Thread B"));

        t1.start();
        t2.start();
    }
}