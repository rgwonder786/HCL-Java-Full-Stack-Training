/*
Java Close Resources.
When working with files, streams, or other resources, it is important to close them after use. If you forget to close a resource, it may keep using memory or even prevent you from opening the file again until the program ends.

Note: You have not yet learned about files and streams in detail. These topics will come in the next chapters. For now, just focus on how try-with-resources works.
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class a75 {

    public static void main(String[] args) {
        try {
            FileOutputStream output = new FileOutputStream("D:\\filename.txt");
            output.write("Hello".getBytes());
            output.close(); // must close manually
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("Error writing file.");
        }

    }
}
