import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class a78 {

    static void readFile() throws FileNotFoundException {

        FileInputStream fis = new FileInputStream("C:/test/a.txt");
    }

    public static void main(String[] args)
            throws FileNotFoundException {

        readFile();
    }
    // This method may produce a FileNotFoundException, and the caller must handle
    // or further declare it.

}
