//2. Using the parallelStream() Method
// Java Program to demonstrate the
// working of parallelStream()
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
//import java.util.stream.Collectors;

public class b47 {
    public static void main(String[] args) throws IOException {
        File file = new File("pathToYourFile.txt");

        // Read all lines from the file into a List
        List<String> lines = Files.readAllLines(file.toPath());

        // Create a parallel stream and print each line
        lines.parallelStream()
             .forEach(System.out::println);
    }
}