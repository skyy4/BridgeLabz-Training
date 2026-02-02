import java.io.*;
import java.util.*;

public class CheckCSVDuplicates {
    public static void main(String[] a) throws Exception {
        BufferedReader r = new BufferedReader(new FileReader("data.csv"));
        Set<String> s = new HashSet<>();
        String x;
        r.readLine(); // Skip header
        while ((x = r.readLine()) != null) {
            String[] parts = x.split(",");
            if (parts.length > 0) {
                String id = parts[0];
                if (!s.add(id))
                    System.out.println("Duplicate Record: " + x);
            }
        }
        r.close();
    }
}
