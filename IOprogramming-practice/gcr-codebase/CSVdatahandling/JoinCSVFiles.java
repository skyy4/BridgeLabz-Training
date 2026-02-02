import java.io.*;
import java.util.*;

public class JoinCSVFiles {
    public static void main(String[] a) throws Exception {
        Map<String, String[]> m = new HashMap<>();
        BufferedReader r1 = new BufferedReader(new FileReader("s1.csv"));
        BufferedReader r2 = new BufferedReader(new FileReader("s2.csv"));
        String s;
        r1.readLine(); // Skip header
        r2.readLine(); // Skip header

        while ((s = r1.readLine()) != null) {
            String[] x = s.split(",");
            m.put(x[0], x);
        }
        while ((s = r2.readLine()) != null) {
            String[] x = s.split(",");
            if (m.containsKey(x[0])) {
                String[] y = m.get(x[0]);
                // Assuming s1 has 3 cols and s2 has 3 cols, joining specific indices
                // Original snippet: y[0],y[1],y[2],x[1],x[2]
                if (y.length >= 3 && x.length >= 3)
                    System.out.println(y[0] + "," + y[1] + "," + y[2] + "," + x[1] + "," + x[2]);
            }
        }
        r1.close();
        r2.close();
    }
}
