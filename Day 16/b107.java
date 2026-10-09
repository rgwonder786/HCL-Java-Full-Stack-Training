//Thread.ofVirtual()
public class b107 {
    public static void main(String[] args) {

        Thread t = Thread.ofVirtual()
                .start(() -> {
                    System.out.println("V.T Running");
                });
        System.out.println(t);
    }
}
