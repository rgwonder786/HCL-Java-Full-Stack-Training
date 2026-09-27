import java.util.ArrayList;
import java.util.*;

public class a114 {
    public static void main(String[] args) {

        List<int[]> lst = new ArrayList<>();
        int count = 0;
        while (true) {
            lst.add(new int[250000]);// -->int--4byte * 250000 = 1M byte = 1MB
            count++;
            System.out.println("Allocated Block: " + count);
        }
    }
}

/*
 * 250,000 × 4 bytes
 * = 1,000,000 bytes
 * ≈ 0.95 MiB
 * ≈ 1 MB
 * ////////////////
 * Block 1 → ~1 MB
 * Block 2 → ~1 MB
 * Block 3 → ~1 MB
 * ...
 * But there's an important point:
 * 2. Java doesn't use all your computer's RAM for the heap
 * You might therefore expect: 4 MB ÷ 1 MB = 4 blocks
 * 2 MB for Block 1
 * 2 MB for Block 2
 */